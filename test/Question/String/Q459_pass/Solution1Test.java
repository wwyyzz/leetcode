package Question.String.Q459_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void repeatedSubstringPattern() {
//        assertTrue(new Solution1().repeatedSubstringPattern("abab"));
//        assertFalse(new Solution1().repeatedSubstringPattern("aba"));
        assertTrue(new Solution1().repeatedSubstringPattern("abcabcabcabc"));
    }
}