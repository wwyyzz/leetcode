package Contest.W204.Q5499;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void containsPattern() {
        int[] arr = {1,2,4,4,4,4};
        assertEquals(true, new Solution1().containsPattern(arr,1,3));
    }

    @Test
    public void containsPattern2() {
        int[] arr = {1,2,1,2,1,1,1,3};
        assertEquals(true, new Solution1().containsPattern(arr,2,2));
    }

    @Test
    public void containsPattern3() {
        int[] arr = {1,2,1,2,1,3};
        assertEquals(false, new Solution1().containsPattern(arr,2,3));
    }

    @Test
    public void containsPattern4() {
        int[] arr = {1,2,3,1,2};
        assertEquals(false, new Solution1().containsPattern(arr,2,2));
    }

    @Test
    public void containsPattern5() {
        int[] arr = {2,2,2,2};
        assertEquals(false, new Solution1().containsPattern(arr,2,3));
    }


    @Test
    public void containsPattern6() {
        int[] arr = {2,2,1,2,2,1,1,1,2,1};
        assertEquals(false, new Solution1().containsPattern(arr,2,2));
    }
}