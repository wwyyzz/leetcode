package Question.String.Q214;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void shortestPalindrome() {
        assertEquals("aaacecaaa", new Solution1().shortestPalindrome("aacecaaa"));
        assertEquals("dcbabcd", new Solution1().shortestPalindrome("abcd"));
        assertEquals("a", new Solution1().shortestPalindrome("a"));
    }
}