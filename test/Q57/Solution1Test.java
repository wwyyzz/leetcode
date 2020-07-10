package Q57;


import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    int[] result1 = {2,7};
    int[] nums1 = {2,7,11,15};

    int[] result2 = {10,30};
    int[] nums2 = {10,26,30,31,47,60};

    @Test
    public void twoSum() {
        assertArrayEquals(result1, new Solution1().twoSum(nums1,9));
        assertArrayEquals(result2, new Solution1().twoSum(nums2,40));
    }
}