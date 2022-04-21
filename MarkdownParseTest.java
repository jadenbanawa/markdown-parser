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
    public void markdownTest1() {
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

    @Test
    public void markdownTest2() {
        List thisList = List.of( "https://github.com/jadenbanawa/markdown-parser");

        MarkdownParse mpObj = new MarkdownParse();
        Path filePath = Path.of("test-file2.md");
        try{

        String fileContent = Files.readString(filePath);
        ArrayList<String> outputList = mpObj.getLinks(fileContent);
        assertEquals(thisList, outputList);

        }catch(IOException e){

        }
 
    }
    @Test
    public void markdownTest3() {
        MarkdownParse mpObj = new MarkdownParse();
        Path filePath = Path.of("test-file3.md");
        try{

        String fileContent = Files.readString(filePath);
        ArrayList<String> outputList = mpObj.getLinks(fileContent);
        assertEquals(null, outputList);

        }catch(IOException e){

        }
 
    }
    @Test
    public void markdownTest4() {
        List thisList = List.of("link.com", "link.com");

        MarkdownParse mpObj = new MarkdownParse();
        Path filePath = Path.of("test-file4.md");
        try{

        String fileContent = Files.readString(filePath);
        ArrayList<String> outputList = mpObj.getLinks(fileContent);
        assertEquals(thisList, outputList);

        }catch(IOException e){

        }
 
    }

}
