package Question.Array.Q215_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void findKthLargest() {
        int[] nums = {3,2,1,5,6,4};

        assertEquals(5, new Solution1().findKthLargest(nums,2));
    }

    @Test
    public void findKthLargest2() {
        int[] nums = {3,2,3,1,2,4,5,5,6};

        assertEquals(4, new Solution1().findKthLargest(nums,4));
    }
}