package Question.array.Q1480_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {
    int[] nums1 ={1,2,3,4};
    int[] result1 = {1,3,6,10};

    int[] nums2 ={1,1,1,1,1};
    int[] result2 = {1,2,3,4,5};

    int[] nums3 ={3,1,2,10,1};
    int[] result3 = {3,4,6,16,17};

    @Test
    public void runningSum() {
        assertArrayEquals(result1, new Solution1().runningSum(nums1));
        assertArrayEquals(result2, new Solution1().runningSum(nums2));
        assertArrayEquals(result3, new Solution1().runningSum(nums3));
    }
}