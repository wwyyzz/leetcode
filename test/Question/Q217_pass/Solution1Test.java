package Question.Q217_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    int[] nums1 = {1, 2, 3, 1};
    int[] nums2 = {1, 2, 3, 4};
    int[] nums3 = {1,1,1,3,3,4,3,2,4,2};

    @Test
    public void containsDuplicate() {
        assertTrue(new Solution1().containsDuplicate(nums1));
        assertFalse(new Solution1().containsDuplicate(nums2));
        assertTrue(new Solution1().containsDuplicate(nums3));
    }
}