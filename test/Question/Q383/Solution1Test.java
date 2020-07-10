package Question.Q383;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void canConstruct() {
        assertFalse(new Solution1().canConstruct("a", "b"));
        assertFalse(new Solution1().canConstruct("aa", "ab"));
        assertTrue(new Solution1().canConstruct("aa", "aab"));
    }
}