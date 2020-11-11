package Offer.Offer61_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isStraight() {
        int[] nums = {1,2,3,4,5};

        assertTrue(new Solution1().isStraight(nums));
    }

    @Test
    public void isStraight2() {
        int[] nums = {1,2,0,4,5};

        assertTrue(new Solution1().isStraight(nums));
    }

    @Test
    public void isStraight3() {
        int[] nums = {1,2,0,0,5};

        assertTrue(new Solution1().isStraight(nums));
    }

    @Test
    public void isStraight4() {
        int[] nums = {1,2,0,0,6};

        assertFalse(new Solution1().isStraight(nums));
    }

    @Test
    public void isStraight5() {
        int[] nums = {1,2,10,0,13};

        assertFalse(new Solution1().isStraight(nums));
    }

    @Test
    public void isStraight6() {
        int[] nums = {13,2,10,0,1};

        assertFalse(new Solution1().isStraight(nums));
    }

    @Test
    public void isStraight7() {
        int[] nums = {7,6,0,4,3};

        assertTrue(new Solution1().isStraight(nums));
    }

    @Test
    public void isStraight8() {
        int[] nums = {0,0,2,2,5};

        assertFalse(new Solution1().isStraight(nums));
    }
}