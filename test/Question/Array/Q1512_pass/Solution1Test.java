package Question.Array.Q1512_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    int[] nums1 = {1,2,3,1,1,3};
    int[] nums2 = {1,1,1,1};
    int[] nums3 = {1,2,3};

    @Test
    public void numIdenticalPairs() {
        assertEquals(4, new Solution1().numIdenticalPairs(nums1));
        assertEquals(6, new Solution1().numIdenticalPairs(nums2));
        assertEquals(0, new Solution1().numIdenticalPairs(nums3));
    }
}