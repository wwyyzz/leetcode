package Question.Q520;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void detectCapitalUse() {
        assertEquals(true, new Solution1().detectCapitalUse("USA"));
        assertEquals(false, new Solution1().detectCapitalUse("FlaG"));
        assertEquals(true, new Solution1().detectCapitalUse("Google"));
        assertEquals(true, new Solution1().detectCapitalUse("leetcode"));
    }
}