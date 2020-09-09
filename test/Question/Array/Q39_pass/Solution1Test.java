package Question.Array.Q39_pass;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void combinationSum() {
        int[] nums = {2,3,5};
        new Solution1().combinationSum(nums, 8);
    }

    @Test
    public void combinationSum2() {
        int[] nums = {2,3,6,7};
        new Solution1().combinationSum(nums, 7);
    }
}