package Question.Q28_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void strStr() {
        assertEquals(2 , new Solution1().strStr("hello", "ll"));
        assertEquals(-1 , new Solution1().strStr("aaaaa", "bba"));
        assertEquals(0 , new Solution1().strStr("", ""));
        assertEquals(0 , new Solution1().strStr("a", "a"));
    }
}