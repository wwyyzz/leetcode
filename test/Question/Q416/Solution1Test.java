package Question.Q416;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void canPartition() {
        int[] nums = {1,5,11,5};
        assertTrue(new Solution1().canPartition(nums));
    }

    @Test
    public void canPartition2() {
        int[] nums = {1,5,11,5,2};
        assertFalse(new Solution1().canPartition(nums));
    }

    @Test
    public void canPartition3() {
        int[] nums = {3,3,3,4,5};
        assertTrue(new Solution1().canPartition(nums));
    }

    @Test
    public void canPartition4() {
        int[] nums = {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,99,97};
        assertTrue(new Solution1().canPartition(nums));
    }
}