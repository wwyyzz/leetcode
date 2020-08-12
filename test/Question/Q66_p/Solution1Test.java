package Question.Q66_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void plusOne1() {
        int[] nums = {1, 2, 3};
        int[] result = {1, 2, 4};

        assertArrayEquals(result, new Solution1().plusOne(nums));
    }

    @Test
    public void plusOne2() {
        int[] nums = {9, 9, 9};
        int[] result = {1, 0, 0, 0};

        assertArrayEquals(result, new Solution1().plusOne(nums));
    }

    @Test
    public void plusOne3() {
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        int[] result =  {9,8,7,6,5,4,3,2,1,1};

        assertArrayEquals(result, new Solution1().plusOne(nums));
    }
}