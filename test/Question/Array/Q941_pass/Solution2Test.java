package Question.Array.Q941_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void validMountainArray() {
        int[] A = {2,1};
        assertFalse(new Solution2().validMountainArray(A));
    }

    @Test
    public void validMountainArray2() {
        int[] A = {3,5,5};
        assertFalse(new Solution2().validMountainArray(A));
    }

    @Test
    public void validMountainArray3() {
        int[] A = {0,3,2,1};
        assertTrue(new Solution2().validMountainArray(A));
    }


    @Test
    public void validMountainArray4() {
        int[] A = {14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3};
        assertFalse(new Solution2().validMountainArray(A));
    }


    @Test
    public void validMountainArray5() {
        int[] A = {2};
        assertTrue(new Solution2().validMountainArray(A));
    }
    @Test
    public void validMountainArray6() {
        int[] A = {0,1,2,3,4,5,6,7,8,9};
        assertFalse(new Solution2().validMountainArray(A));
    }

    @Test
    public void validMountainArray7() {
        int[] A = {9,8,7,6,5,4,3,2,1,0};
        assertFalse(new Solution2().validMountainArray(A));
    }

    @Test
    public void validMountainArray8() {
        int[] A = {1,2,3,9,8,7,12,14,15,6,5,4,3,2,1,0};
        assertFalse(new Solution2().validMountainArray(A));
    }
}