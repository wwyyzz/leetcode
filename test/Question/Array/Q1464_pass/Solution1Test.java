package Question.Array.Q1464_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void maxProduct() {
        int[] nums = {3,4,5,2};

        assertEquals(12, new Solution1().maxProduct(nums));
    }

    @Test
    public void maxProduct2() {
        int[] nums = {3,7};

        assertEquals(12, new Solution1().maxProduct(nums));
    }
}