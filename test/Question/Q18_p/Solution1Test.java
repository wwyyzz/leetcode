package Question.Q18_p;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void fourSum() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        new Solution1().fourSum(nums,target);
    }
}