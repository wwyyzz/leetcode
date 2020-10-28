package Question.Array.Q373;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void kSmallestPairs() {
        int[] nums1 = {1,7,11};
        int[] nums2 = {2,4,6};

        new Solution1().kSmallestPairs(nums1, nums2, 3);
    }

    @Test
    public void kSmallestPairs2() {
        int[] nums1 = {1,1,2};
        int[] nums2 = {1,2,3};

        new Solution1().kSmallestPairs(nums1, nums2, 2);
    }

    @Test
    public void kSmallestPairs3() {
        int[] nums1 = {1,2};
        int[] nums2 = {3};

        new Solution1().kSmallestPairs(nums1, nums2, 3);
    }
}