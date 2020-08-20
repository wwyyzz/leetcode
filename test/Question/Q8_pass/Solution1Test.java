package Question.Q8_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void myAtoi() {
        assertEquals(42, new Solution1().myAtoi("42"));
        assertEquals(0, new Solution1().myAtoi(""));
        assertEquals(0, new Solution1().myAtoi("-"));
        assertEquals(0, new Solution1().myAtoi("+"));
        assertEquals(1, new Solution1().myAtoi("+1"));
        assertEquals(0, new Solution1().myAtoi("+-2"));
        assertEquals(-42, new Solution1().myAtoi("    -42"));
        assertEquals(4193, new Solution1().myAtoi("4193 with words"));
        assertEquals(0, new Solution1().myAtoi("words and 987"));
        assertEquals(-2147483648, new Solution1().myAtoi("-91283472332"));


    }
}