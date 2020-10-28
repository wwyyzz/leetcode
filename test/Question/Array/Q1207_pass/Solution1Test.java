package Question.Array.Q1207_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void uniqueOccurrences() {
        int[] arr = {1,2,2,1,1,3};
        assertTrue(new Solution1().uniqueOccurrences(arr));
    }

    @Test
    public void uniqueOccurrences2() {
        int[] arr = {1,2};
        assertFalse(new Solution1().uniqueOccurrences(arr));
    }

    @Test
    public void uniqueOccurrences3() {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        assertTrue(new Solution1().uniqueOccurrences(arr));
    }
}