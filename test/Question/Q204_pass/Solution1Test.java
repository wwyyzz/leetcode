package Question.Q204_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void countPrimes() {
        assertEquals(4, new Solution1().countPrimes(10));
        assertEquals(8, new Solution1().countPrimes(20));
        assertEquals(25, new Solution1().countPrimes(100));
        assertEquals(13848, new Solution1().countPrimes(150000));
    }

    @Test
    public void countPrimes2() {
        assertEquals(4, new Solution2().countPrimes(10));
        assertEquals(8, new Solution2().countPrimes(20));
        assertEquals(25, new Solution2().countPrimes(100));
        assertEquals(13848, new Solution2().countPrimes(150000));
    }

    @Test
    public void countPrimes3() {
        assertEquals(4, new Solution3().countPrimes(10));
        assertEquals(8, new Solution3().countPrimes(20));
        assertEquals(25, new Solution3().countPrimes(100));
        assertEquals(13848, new Solution3().countPrimes(150000));
    }
}