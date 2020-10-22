package Question.Array.Q1588_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void sumOddLengthSubarrays() {
        int[] arr = {1,4,2,5,3};
        assertEquals(58, new Solution1().sumOddLengthSubarrays(arr));
    }

    @Test
    public void sumOddLengthSubarrays2() {
        int[] arr = {1,2};
        assertEquals(3, new Solution1().sumOddLengthSubarrays(arr));
    }

    @Test
    public void sumOddLengthSubarrays3() {
        int[] arr = {10,11,12};
        assertEquals(66, new Solution1().sumOddLengthSubarrays(arr));
    }
}