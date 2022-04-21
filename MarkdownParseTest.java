import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
    assertEquals(2, 1 + 1);
    }

    @Test
    public void markdownTest() {
        List thisList = List.of("https://something.com", "some-thing.html");

        MarkdownParse mpObj = new MarkdownParse();
        Path filePath = Path.of("test-file.md");
        try{

        String fileContent = Files.readString(filePath);
        ArrayList<String> outputList = mpObj.getLinks(fileContent);
        assertEquals(thisList, outputList);

        }catch(IOException e){

        }
 
    }

}
