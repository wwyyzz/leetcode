package Question.Array.Q1051;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void heightChecker() {
        int[] heights = {1,1,4,2,1,3};
        assertEquals(3 , new Solution1().heightChecker(heights));
    }
}