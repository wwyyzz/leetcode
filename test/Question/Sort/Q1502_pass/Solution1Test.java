package Question.Sort.Q1502_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void canMakeArithmeticProgression() {
        int[] arr = {3,5,1};
        assertEquals(true, new Solution1().canMakeArithmeticProgression(arr));
    }

    @Test
    public void canMakeArithmeticProgression2() {
        int[] arr = {1,2,4};
        assertEquals(false, new Solution1().canMakeArithmeticProgression(arr));
    }

    @Test
    public void canMakeArithmeticProgression3() {
        int[] arr = {10,8,6,4,2,3,5,7};
        assertEquals(false, new Solution1().canMakeArithmeticProgression(arr));
    }
}