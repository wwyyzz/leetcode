package Question.Bitwise.Q693_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void hasAlternatingBits() {
        assertTrue(new Solution1().hasAlternatingBits(5));
    }

    @Test
    public void hasAlternatingBits2() {
        assertFalse(new Solution1().hasAlternatingBits(7));
    }

    @Test
    public void hasAlternatingBit3() {
        assertFalse(new Solution1().hasAlternatingBits(11));
    }

    @Test
    public void hasAlternatingBits4() {
        assertTrue(new Solution1().hasAlternatingBits(10));
    }

    @Test
    public void hasAlternatingBit5() {
        assertFalse(new Solution1().hasAlternatingBits(3));
    }
}