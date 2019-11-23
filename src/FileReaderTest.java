import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class FileReaderTest {
    @Rule public TemporaryFolder folder = new TemporaryFolder();
    private File file;
    private FileReader fileReader;
    private FileWriter writer;


    @Before
    public void setUp() throws Exception {
        file = folder.newFile("test.txt");
        fileReader = new FileReader();
        writer = new FileWriter(file);

    }

    @Test public void when_fileIsEmpty_fileReaderReturnsEmptyList() throws IOException {
        assertEquals(0,fileReader.getListOfWords(file).size());
    }

    @Test
    public void when_fileOnlyHasNewLines_fileReaderReturnsEmptyList() throws IOException {
        writer.write("\n\n\n\n\n\n\n\n");
        assertEquals(0,fileReader.getListOfWords(file).size());
    }

    @Test
    public void when_fileHasWordsSingleCharacter_fileReaderReturnsListOfSizeOne()
            throws IOException {
        writer.write("a");
        writer.close();
        assertEquals(1,fileReader.getListOfWords(file).size());
    }

    @Test
    public void when_fileHasWordsSeparatedByNewLines_fileReaderReturnsListOfWords()
            throws IOException {
        writer.write("taco\nsalad\n");
        writer.close();
        List<String> listOfWords = fileReader.getListOfWords(file);
        assertEquals(2, listOfWords.size());
        assertEquals("taco",listOfWords.get(0));
        assertEquals("salad", listOfWords.get(1));
    }
}