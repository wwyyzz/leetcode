package Question.string.Q58_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void lengthOfLastWord() {
        assertEquals(5, new Solution2().lengthOfLastWord("Hello world"));
        assertEquals(3, new Solution2().lengthOfLastWord("Hello wor"));
        assertEquals(6, new Solution2().lengthOfLastWord("Hello abc world!"));
        assertEquals(5, new Solution2().lengthOfLastWord("Hello"));
//        assertEquals(0, new Solution2().lengthOfLastWord("a "));
        assertEquals(0, new Solution2().lengthOfLastWord(" "));
        assertEquals(0, new Solution2().lengthOfLastWord(" "));
        assertEquals(0, new Solution2().lengthOfLastWord("    "));
    }
}