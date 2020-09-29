package Question.Q18_pass;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void fourSum() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        new Solution1().fourSum(nums,target);
    }

    @Test
    public void fourSum2() {
        int[] nums = {-3,-2,-1,0,0,1,2,3};
        int target = 0;
        new Solution1().fourSum(nums,target);
    }

    @Test
    public void fourSum3() {
        int[] nums = {-5,5,4,-3,0,0,4,-2};
        int target = 4;
        new Solution1().fourSum(nums,target);
    }
}