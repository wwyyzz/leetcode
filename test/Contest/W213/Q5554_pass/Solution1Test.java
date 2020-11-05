package Contest.W213.Q5554_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void canFormArray() {
        int[] arr = {91,4,64,78};
        int[][] pieces = {{78},{4,64},{91}};

        assertTrue(new Solution1().canFormArray(arr, pieces));
        
    }


    @Test
    public void canFormArray2() {
        int[] arr = {85};
        int[][] pieces = {{85}};

        assertTrue(new Solution1().canFormArray(arr, pieces));

    }

    @Test
    public void canFormArray3() {
        int[] arr = {15,88};
        int[][] pieces = {{88},{15}};

        assertTrue(new Solution1().canFormArray(arr, pieces));

    }

    @Test
    public void canFormArray4() {
        int[] arr = {1,3,5,7};
        int[][] pieces = {{2,4,6,8}};

        assertFalse(new Solution1().canFormArray(arr, pieces));

    }

    @Test
    public void canFormArray5() {
        int[] arr = {49,18,16};
        int[][] pieces = {{16, 18, 49}};

        assertFalse(new Solution1().canFormArray(arr, pieces));

    }


    @Test
    public void canFormArray6() {

        int[] arr = {1,26,80,65,57,78,10,19,42,31,43,62,64};
        int[][] pieces = {{43,57},{64,80,65,78,26},{1,62,19,31},{10,42}};

        assertFalse(new Solution1().canFormArray(arr, pieces));

    }
}