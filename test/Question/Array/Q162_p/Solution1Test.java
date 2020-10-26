package Question.Array.Q162_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void findPeakElement() {
        int[] nums = {1,2,3,1};

        assertEquals(2, new Solution1().findPeakElement(nums));
    }

    @Test
    public void findPeakElement2() {
        int[] nums = {1,2,1,3,5,6,4};

        assertEquals(1, new Solution1().findPeakElement(nums));
    }
}