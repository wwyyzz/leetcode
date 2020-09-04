package Question.Math.Q204_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution3Test {

    @Test
    public void countPrimes() {
        assertEquals(4, new Solution1().countPrimes(10));
        assertEquals(4, new Solution1().countPrimes(499979));
    }
}