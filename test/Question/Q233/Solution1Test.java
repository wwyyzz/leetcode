package Question.Q233;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void countDigitOne() {
        assertEquals(6 ,new Solution1().countDigitOne(13));
        assertEquals(689 ,new Solution1().countDigitOne(1234));
//        assertEquals(6 ,new Solution1().countDigitOne(824883294));
    }
}