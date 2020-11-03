package Question.Array.Q941_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void validMountainArray() {
        int[] A = {2,1};
        assertFalse(new Solution1().validMountainArray(A));
    }

    @Test
    public void validMountainArray2() {
        int[] A = {3,5,5};
        assertFalse(new Solution1().validMountainArray(A));
    }

    @Test
    public void validMountainArray3() {
        int[] A = {0,3,2,1};
        assertTrue(new Solution1().validMountainArray(A));
    }


    @Test
    public void validMountainArray4() {
        int[] A = {14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3};
        assertFalse(new Solution1().validMountainArray(A));
    }

}