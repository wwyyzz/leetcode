package Question.Array.Q66_pass;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution2Test {

    @Test
    public void plusOne1() {
        int[] nums = {1, 2, 3};
        int[] result = {1, 2, 4};

        assertArrayEquals(result, new Solution2().plusOne(nums));
    }



    @Test
    public void plusOne2() {
        int[] nums = {9, 9, 9};
        int[] result = {1, 0, 0, 0};

        assertArrayEquals(result, new Solution2().plusOne(nums));
    }

    @Test
    public void plusOne3() {
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        int[] result =  {9,8,7,6,5,4,3,2,1,1};

        assertArrayEquals(result, new Solution2().plusOne(nums));
    }

    @Test
    public void plusOne4() {
        int[] nums = {8, 9, 9};
        int[] result = { 9, 0, 0};

        assertArrayEquals(result, new Solution2().plusOne(nums));
    }

    @Test
    public void plusOne5() {
        int[] nums = {9,9,9, 9, 9};
        int[] result = { 1,0,0,0,0 , 0};

        assertArrayEquals(result, new Solution2().plusOne(nums));
    }

    @Test
    public void plusOne6() {
        int[] nums = {9};
        int[] result = { 1,0};

        assertArrayEquals(result, new Solution2().plusOne(nums));
    }
}