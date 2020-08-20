package Question.Q13;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void romanToInt() {
        assertEquals(1476 , new Solution1().romanToInt("MCDLXXVI"));
        assertEquals(3 , new Solution1().romanToInt("III"));
        assertEquals(9 , new Solution1().romanToInt("IX"));
        assertEquals(4 , new Solution1().romanToInt("IV"));
        assertEquals(58 , new Solution1().romanToInt("LVIII"));
        assertEquals(1994 , new Solution1().romanToInt("MCMXCIV"));
    }
}