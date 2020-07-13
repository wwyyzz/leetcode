package contest.Q5446;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    int[] nums1 = {5,3,2,4};
    int[] nums2 = {1,5,0,10,14};
    int[] nums3 = {6,6,0,1,1,4,6};
    int[] nums4 = {1,5,6,14,15};
    int[] nums5 = {82,81,95,75,20};

    @Test
    public void minDifference() {
        assertEquals(0 , new Solution1().minDifference(nums1));
        assertEquals(1 , new Solution1().minDifference(nums2));
        assertEquals(2 , new Solution1().minDifference(nums3));
        assertEquals(1 , new Solution1().minDifference(nums4));
    }
}