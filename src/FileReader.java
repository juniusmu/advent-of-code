import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public List<String> getListOfWords(File file) throws IOException {
        java.io.FileReader fileReader = new java.io.FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string;
        List<String> listOfWords = new ArrayList<>();
        while ((string = bufferedReader.readLine()) != null) {
            listOfWords.add(string);
        }
        return listOfWords;
    }
}
