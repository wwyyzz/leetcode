package Question.Array.Q645_pass;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void findErrorNums() {
        int[] nums = {1,2,2,4};

        new Solution1().findErrorNums(nums);
    }

    @Test
    public void findErrorNums2() {
        int[] nums = {1,1};

        new Solution1().findErrorNums(nums);
    }

    @Test
    public void findErrorNums3() {
        int[] nums = {3,2,2};

        new Solution1().findErrorNums(nums);
    }
}