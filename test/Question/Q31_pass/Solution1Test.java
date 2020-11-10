package Question.Q31_pass;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void nextPermutation() {
        int[] nums = {1,5,2,4,3,2};
        new Solution1().nextPermutation(nums);
    }

    @Test
    public void nextPermutation2() {
        int[] nums = {1,2,3};
        new Solution1().nextPermutation(nums);
    }

    @Test
    public void nextPermutation3() {
        int[] nums = {3,2,1};
        new Solution1().nextPermutation(nums);
    }

    @Test
    public void nextPermutation4() {
        int[] nums = {1,1,5};
        new Solution1().nextPermutation(nums);
    }
}