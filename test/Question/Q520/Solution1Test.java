package Question.Q520;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void detectCapitalUse() {
        assertTrue(new Solution1().detectCapitalUse("USA"));
        assertFalse(new Solution1().detectCapitalUse("FlaG"));
        assertTrue(new Solution1().detectCapitalUse("Google"));
        assertTrue(new Solution1().detectCapitalUse("leetcode"));
    }
}