package Question.Array.Q496_pass;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void nextGreaterElement() {
        int[] nums1 ={4,1,2};
        int[] nums2 ={1,3,4,2};

        new Solution1().nextGreaterElement(nums1,nums2);
    }

    @Test
    public void nextGreaterElement2() {
        int[] nums1 ={2,4};
        int[] nums2 ={1,2,3,4};

        new Solution1().nextGreaterElement(nums1,nums2);
    }
}