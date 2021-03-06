package Offer.Offer56_II_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void singleNumber() {
        int[] nums = {3,4,3,3};
        assertEquals(4, new Solution1().singleNumber(nums));
    }

    @Test
    public void singleNumber2() {
        int[] nums = {9,1,7,9,7,9,7};
        assertEquals(1, new Solution1().singleNumber(nums));
    }
}