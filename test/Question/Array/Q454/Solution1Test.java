package Question.Array.Q454;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void fourSumCount() {
        int[] A = {1,2};
        int[] B = {-2,1};
        int[] C = {-1,2};
        int[] D = {0,2};

        assertEquals(2, new Solution1().fourSumCount(A,B,C,D));
    }
}