package Question.HashTable.Q409;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void longestPalindrome() {
        assertEquals(7, new Solution1().longestPalindrome("abccccdd"));
        assertEquals(3, new Solution1().longestPalindrome("ccc"));
        assertEquals(9, new Solution1().longestPalindrome("ababababa"));
    }
}