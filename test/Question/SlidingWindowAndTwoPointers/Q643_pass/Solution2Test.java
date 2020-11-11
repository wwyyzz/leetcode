package Question.SlidingWindowAndTwoPointers.Q643_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void findMaxAverage() {
        int[] nums = {1,12,-5,-6,50,3};

        assertEquals(12.75, new Solution2().findMaxAverage(nums,4),0.0001);
    }
}