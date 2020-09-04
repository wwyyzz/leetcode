package Question.Array.Q1470_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    int[] nums1 = {2,5,1,3,4,7};
    int[] nums2 = {1,2,3,4,4,3,2,1};
    int[] nums3 = {1,1,2,2};

    int[] result1 = {2,3,5,4,1,7};
    int[] result2 = {1,4,2,3,3,2,4,1};
    int[] result3 = {1,2,1,2};

    @Test
    public void shuffle() {
        assertArrayEquals(result1 , new Solution1().shuffle(nums1, 3));
        assertArrayEquals(result2 , new Solution1().shuffle(nums2, 4));
        assertArrayEquals(result3 , new Solution1().shuffle(nums3, 2));
    }
}