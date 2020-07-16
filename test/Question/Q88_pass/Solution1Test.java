package Question.Q88_pass;

import org.junit.Test;

public class Solution1Test {
    int[] result = new int[]{1,2,2,3,5,6};
    int[] nums1 = new int[]{1,2,3,0,0,0};
    int[] nums2 = new int[]{2,5,6};

    @Test
    public void merge() {
        new Solution1().merge(nums1, 3, nums2, 3);
    }
}