import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
     File file = new File("./src/input.txt");
     FileReader fileReader = new FileReader();
     FrequencyCalculator frequencyCalculator = new FrequencyCalculator();
        List<String> frequencies = new ArrayList<>();
        try {
            frequencies =  fileReader.getListOfWords(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        frequencies.forEach(frequencyCalculator::add);
        System.out.println("Final Total: " + frequencyCalculator.getTotalFrequency());
    }
}
