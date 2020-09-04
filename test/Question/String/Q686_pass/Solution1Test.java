package Question.String.Q686_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void repeatedStringMatch() {
        assertEquals(3 , new Solution1().repeatedStringMatch("abcd","cdabcdab"));
        assertEquals(-1 , new Solution1().repeatedStringMatch("abcabcabcabc","abac"));
        assertEquals(4 , new Solution1().repeatedStringMatch("abc","cabcabca"));
    }
}