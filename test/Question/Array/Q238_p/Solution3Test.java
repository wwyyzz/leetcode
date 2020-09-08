package Question.Array.Q238_p;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution3Test {

    @Test
    public void productExceptSelf() {
        int[] nums ={1,2,3,4};
        int[] result = {24,12,8,6};

        assertArrayEquals(result, new Solution3().productExceptSelf(nums));
    }

    @Test
    public void productExceptSelf2() {
        int[] nums ={5,4,3,2,1};
        int[] result = {24,30,40,60,120};

        assertArrayEquals(result, new Solution3().productExceptSelf(nums));
    }
}