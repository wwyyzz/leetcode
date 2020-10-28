package Question.Q357_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void countNumbersWithUniqueDigits() {
        assertEquals(91, new Solution1().countNumbersWithUniqueDigits(2));
    }

    @Test
    public void countNumbersWithUniqueDigits2() {
        assertEquals(739, new Solution1().countNumbersWithUniqueDigits(3));
    }

    @Test
    public void countNumbersWithUniqueDigits3() {
        assertEquals(5275, new Solution1().countNumbersWithUniqueDigits(4));
    }

    @Test
    public void countNumbersWithUniqueDigits4() {
        assertEquals(32491, new Solution1().countNumbersWithUniqueDigits(5));
    }
}