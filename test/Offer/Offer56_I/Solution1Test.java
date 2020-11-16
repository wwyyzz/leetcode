package Offer.Offer56_I;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void singleNumbers() {
        int[] nums = {4,1,4,6};
        int[] result ={1,6};

        assertArrayEquals(result, new Solution1().singleNumbers(nums));
    }

    @Test
    public void singleNumbers2() {
        int[] nums = {1,2,10,4,1,4,3,3};
        int[] result ={2, 10};

        assertArrayEquals(result, new Solution1().singleNumbers(nums));
    }

    @Test
    public void singleNumbers3() {
        int[] nums = {1,2,10,4,1,4,3,3};
        int[] result ={2, 10};

        assertArrayEquals(result, new Solution1().singleNumbers(nums));
    }
}