package Question.Q35;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void searchInsert() {
        assertEquals(2, new Solution1().searchInsert(new int[]{1,3,5,6},5));
        assertEquals(1, new Solution1().searchInsert(new int[]{1,3,5,6},2));
        assertEquals(4, new Solution1().searchInsert(new int[]{1,3,5,6},7));
        assertEquals(0, new Solution1().searchInsert(new int[]{1,3,5,6},0));
    }
}