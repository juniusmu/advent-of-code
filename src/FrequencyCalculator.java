import java.util.List;

public class FrequencyCalculator {

    private int totalFrequency = 0;

    public int getTotalFrequency() {
        return totalFrequency;
    }

    public void add(int frequency) {
        totalFrequency += frequency;
        System.out.println("adding: " + frequency + "total: " + totalFrequency+"\n");
    }

    public void add(String frequency) {
        totalFrequency += Integer.valueOf(frequency);
        System.out.println("Adding: " + frequency + "\nTotal: " + totalFrequency+"\n");
    }

    public List<Integer> getFrequencies() {
        return List.of(0);
    }
}
