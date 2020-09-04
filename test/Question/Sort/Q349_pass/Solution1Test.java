package Question.Sort.Q349_pass;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void intersection1() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        new Solution1().intersection(nums1, nums2);
    }

    @Test
    public void intersection2() {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        new Solution1().intersection(nums1, nums2);
    }
}