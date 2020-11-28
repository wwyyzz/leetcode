package Question.Array.Q493;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void reversePairs() {
        int[] nums = {1,3,2,3,1};

        assertEquals(2, new Solution1().reversePairs(nums));
    }

    @Test
    public void reversePairs2() {
        int[] nums = {2,4,3,5,1};
        assertEquals(3, new Solution1().reversePairs(nums));
    }
}