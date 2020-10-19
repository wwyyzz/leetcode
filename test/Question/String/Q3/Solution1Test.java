package Question.String.Q3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void lengthOfLongestSubstring() {
        assertEquals(3, new Solution1().lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void lengthOfLongestSubstring2() {
        assertEquals(3, new Solution1().lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void lengthOfLongestSubstring3() {
        assertEquals(1, new Solution1().lengthOfLongestSubstring("bbbbb"));
    }
}