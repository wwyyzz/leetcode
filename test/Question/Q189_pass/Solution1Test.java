package Question.Q189_pass;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void rotate() {
        int[] nums = {1,2,3,4,5,6,7};
        new Solution1().rotate(nums,3);
    }

    @Test
    public void rotate2() {
        int[] nums = {-1, -100,3,99};
        new Solution1().rotate(nums,2);
    }
}