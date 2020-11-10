package Offer.Offer03_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    int[] nums1 = {2, 3, 1, 0, 2, 5, 3} ;
    @Test
    public void findRepeatNumber() {
        assertEquals(2, new Solution1().findRepeatNumber(nums1));
    }
}