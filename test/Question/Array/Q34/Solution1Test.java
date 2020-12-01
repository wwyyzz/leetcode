package Question.Array.Q34;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void searchRange() {
        int[] nums = {5,7,7,8,8,10};
        new Solution1().searchRange(nums, 8);
    }

    @Test
    public void searchRange2() {
        int[] nums = {5,7,7,8,8,10};
        new Solution1().searchRange(nums, 6);
    }

    @Test
    public void searchRange3() {
        int[] nums = {};
        new Solution1().searchRange(nums, 0);
    }
}