package Question.Q46_pass;

import org.junit.Test;

public class Solution2Test {

    @Test
    public void permute1() {
        int[] nums = {1,2,3};
        new Solution2().permute(nums);
    }

    @Test
    public void permute2() {
        int[] nums = {1,2,3,4};
        new Solution2().permute(nums);
    }

    @Test
    public void permute3() {
        int[] nums = {0,-1,1};
        new Solution2().permute(nums);
    }
}