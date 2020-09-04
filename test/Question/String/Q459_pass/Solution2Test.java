package Question.String.Q459_pass;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution2Test {

    @Test
    public void repeatedSubstringPattern() {
        assertTrue(new Solution2().repeatedSubstringPattern("abab"));
        assertFalse(new Solution2().repeatedSubstringPattern("aba"));
        assertTrue(new Solution2().repeatedSubstringPattern("abcabcabcabc"));
    }
}