package Offer.Offer53_I_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void search() {
        int[] nums = {5,7,7,8,8,10};
        assertEquals(2, new Solution1().search(nums,8));
    }

    @Test
    public void search2() {
        int[] nums = {5,7,7,8,8,10};
        assertEquals(0, new Solution1().search(nums,6));
    }
}