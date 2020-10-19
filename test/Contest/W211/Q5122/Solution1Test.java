package Contest.W211.Q5122;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void trimMean() {
        int[] arr = {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
        assertEquals(4.77778 , new Solution1().trimMean(arr));
    }

    @Test
    public void trimMean2() {
        int[] arr = {9,7,8,7,7,8,4,4,6,8,8,7,6,8,8,9,2,6,0,0,1,10,8,6,3,3,5,1,10,9,0,7,10,0,10,4,1,10,6,9,3,6,0,0,2,7,0,6,7,2,9,7,7,3,0,1,6,1,10,3};
        assertEquals(5.27778 , new Solution1().trimMean(arr));
    }
}