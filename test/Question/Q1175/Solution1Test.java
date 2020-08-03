package Question.Q1175;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void numPrimeArrangements() {
        assertEquals(12, new Solution1().numPrimeArrangements(5));
        assertEquals(682289015, new Solution1().numPrimeArrangements(100));
    }
}