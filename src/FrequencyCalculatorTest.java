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
        List<Integer> frequencies = frequencyCalculator.getFrequencyLog();
        assertEquals(1, frequencies.size());
        assertEquals(java.util.Optional.of(0).get(), frequencies.get(0));
    }

    @Test
    public void when_getTotalFrequencyOfNewFrequencyCalculatorIsCalled_zeroIsReturned(){
        assertEquals(frequencyCalculator.getTotalFrequency(), 0);
    }

    @Test
    public void when_positiveFrequenciesAreAdded_totalFrequencyIncreases() {
        frequencyCalculator.add(1);
        frequencyCalculator.add(1);
        List<Integer> frequencies = frequencyCalculator.getFrequencyLog();
        assertEquals(frequencyCalculator.getTotalFrequency(), 2);
        assertEquals(3, frequencies.size());
        assertEquals(java.util.Optional.of(1).get(), frequencies.get(1));
        assertEquals(java.util.Optional.of(2).get(), frequencies.get(2));

    }

    @Test
    public void when_negativeFrequenciesAreAdded_totalFrequencyDecreases() {
        frequencyCalculator.add(-1);
        frequencyCalculator.add(-2);
        List<Integer> frequencies = frequencyCalculator.getFrequencyLog();
        assertEquals(frequencyCalculator.getTotalFrequency(), -3);
        assertEquals(3, frequencies.size());
        assertEquals(java.util.Optional.of(-1).get(), frequencies.get(1));
        assertEquals(java.util.Optional.of(-3).get(), frequencies.get(2));
    }

    @Test
    public void when_frequenciesInStringFormatAreAdded_totalFrequencyIsReturned() {
        frequencyCalculator.add("1");
        frequencyCalculator.add("2");
        frequencyCalculator.add("+2");
        frequencyCalculator.add("-1");
        List<Integer> frequencies = frequencyCalculator.getFrequencyLog();
        assertEquals(frequencyCalculator.getTotalFrequency(), 4);
        assertEquals(5, frequencies.size());
        assertEquals(java.util.Optional.of(1).get(), frequencies.get(1));
        assertEquals(java.util.Optional.of(3).get(), frequencies.get(2));
        assertEquals(java.util.Optional.of(5).get(), frequencies.get(3));
        assertEquals(java.util.Optional.of(4).get(), frequencies.get(4));

    }
}