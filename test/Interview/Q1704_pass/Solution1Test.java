package Interview.Q1704_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void missingNumber() {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        assertEquals(8 , new Solution1().missingNumber(nums));

    }
}