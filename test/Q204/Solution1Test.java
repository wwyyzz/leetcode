package Q204;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void countPrimes() {
        assertEquals(4, new Solution1().countPrimes(10));
        assertEquals(8, new Solution1().countPrimes(20));
        assertEquals(25, new Solution1().countPrimes(100));
        assertEquals(114155, new Solution1().countPrimes(1500000));
    }
}