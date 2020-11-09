package Offer.Offer53_II_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void missingNumber() {
        int[] nums = {0,1,3};
        assertEquals(2, new Solution1().missingNumber(nums));
    }

    @Test
    public void missingNumber2() {
        int[] nums = {0,1,2,3,4,5,6,7,9};
        assertEquals(8, new Solution1().missingNumber(nums));
    }
}