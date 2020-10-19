package Question.Bitwise.Q190;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void reverseBits() {
        assertEquals(964176192, new Solution1().reverseBits(43261596));
    }

    @Test
    public void reverseBits2() {
        assertEquals(-1073741825, new Solution1().reverseBits(-3));
    }
}