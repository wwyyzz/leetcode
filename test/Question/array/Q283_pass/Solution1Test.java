package Question.array.Q283_pass;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void moveZeroes() {
        int[] nums = {0,1,0,3,12};
        int[] nums2 = {0,1,0,3,12,3,5,0,0,11};
        int[] result = {1,3,12,0,0};

        new Solution1().moveZeroes(nums);
        new Solution1().moveZeroes(nums2);
    }
}