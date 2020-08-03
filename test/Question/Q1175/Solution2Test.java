package Question.Q1175;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {

    @Test
    public void numPrimeArrangements() {
        assertEquals(12, new Solution2().numPrimeArrangements(5));
        assertEquals(682289015, new Solution2().numPrimeArrangements(100));
    }
}