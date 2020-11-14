package Offer.Offer49;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void nthUglyNumber() {
        assertEquals(12, new Solution2().nthUglyNumber(10));
    }

    @Test
    public void nthUglyNumber2() {
        assertEquals(402653184, new Solution2().nthUglyNumber(1352));
    }
}