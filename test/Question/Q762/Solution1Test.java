package Question.Q762;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void countPrimeSetBits() {
        assertEquals(4, new Solution1().countPrimeSetBits(6, 10));
        assertEquals(5, new Solution1().countPrimeSetBits(10, 15));
    }
}