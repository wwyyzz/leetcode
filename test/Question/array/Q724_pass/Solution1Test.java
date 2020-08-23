package Question.array.Q724_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void pivotIndex() {
        assertEquals(3 , new Solution1().pivotIndex(new int[]{1,7,3,6,5,6}));
        assertEquals(-1 , new Solution1().pivotIndex(new int[]{1,2,3}));
        assertEquals(0 , new Solution1().pivotIndex(new int[]{-1,-1,-1,0,1,1}));
    }

    @Test
    public void pivotIndex2() {
        assertEquals(3 , new Solution2().pivotIndex(new int[]{1,7,3,6,5,6}));
        assertEquals(-1 , new Solution2().pivotIndex(new int[]{1,2,3}));
        assertEquals(0 , new Solution2().pivotIndex(new int[]{-1,-1,-1,0,1,1}));
    }
}