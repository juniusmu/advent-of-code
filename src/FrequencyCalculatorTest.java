import static org.junit.Assert.*;

import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FrequencyCalculatorTest {

    private FrequencyCalculator frequencyCalculator;

    @Before
    public void setUp() {
        frequencyCalculator = new FrequencyCalculator();

    }

    @Test
    public void when_frequencyCalculatorIsCreated_getFrequencyReturnsListOfSizeOne() {
        List<Integer> frequencies = frequencyCalculator.getFrequencies();
    }

    @Test
    public void when_getTotalFrequencyOfNewFrequencyCalculatorIsCalled_zeroIsReturned(){
        assertEquals(frequencyCalculator.getTotalFrequency(), 0);
    }

    @Test
    public void when_positiveFrequenciesAreAdded_totalFrequencyIncreases() {
        frequencyCalculator.add(1);
        frequencyCalculator.add(1);
        assertEquals(frequencyCalculator.getTotalFrequency(), 2);
    }

    @Test
    public void when_negativeFrequenciesAreAdded_totalFrequencyDecreases() {
        frequencyCalculator.add(-1);
        frequencyCalculator.add(-2);
        assertEquals(frequencyCalculator.getTotalFrequency(), -3);
    }

    @Test
    public void when_frequenciesInStringFormatAreAdded_totalFrequencyIsReturned() {
        frequencyCalculator.add("1");
        frequencyCalculator.add("2");
        frequencyCalculator.add("+2");
        frequencyCalculator.add("-1");
        assertEquals(frequencyCalculator.getTotalFrequency(), 4);
    }
}