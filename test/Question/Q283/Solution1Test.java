package Question.Q283;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void moveZeroes() {
        int[] nums = {0,1,0,3,12};
        int[] result = {1,3,12,0,0};

        new Solution1().moveZeroes(nums);
    }
}