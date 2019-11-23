import java.util.ArrayList;
import java.util.List;

public class FrequencyCalculator {

    private int totalFrequency = 0;
    private List<Integer> frequencyLog = new ArrayList<>();

    public FrequencyCalculator() {
        frequencyLog.add(0);
    }

    public int getTotalFrequency() {
        return totalFrequency;
    }

    public void add(int frequency) {
        totalFrequency += frequency;
        frequencyLog.add(totalFrequency);
        System.out.println("adding: " + frequency + "total: " + totalFrequency+"\n");
    }

    public void add(String frequency) {
        totalFrequency += Integer.valueOf(frequency);
        frequencyLog.add(totalFrequency);
        System.out.println("Adding: " + frequency + "\nTotal: " + totalFrequency+"\n");
    }

    public List<Integer> getFrequencyLog() {
        return frequencyLog;
    }
}
