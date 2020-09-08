package Question.Array.Q238_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void productExceptSelf() {
        int[] nums ={1,2,3,4};
        int[] result = {24,12,8,6};

        assertArrayEquals(result, new Solution1().productExceptSelf(nums));
    }

    @Test
    public void productExceptSelf2() {
        int[] nums ={1,2,3,4,5};
        int[] result = {120,60,40,30,24};

        assertArrayEquals(result, new Solution1().productExceptSelf(nums));
    }
}