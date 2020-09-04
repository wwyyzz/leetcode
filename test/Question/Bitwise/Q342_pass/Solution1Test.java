package Question.Bitwise.Q342_pass;


import org.junit.Test;

import static org.junit.Assert.*;


public class Solution1Test {

    @Test
    public void isPowerOfFour() {
        assertTrue(new Solution1().isPowerOfFour(1024));
        assertFalse(new Solution1().isPowerOfFour(1025));
        assertTrue(new Solution1().isPowerOfFour(16));
        assertFalse(new Solution1().isPowerOfFour(17));
        assertFalse(new Solution1().isPowerOfFour(100));
        assertTrue(new Solution1().isPowerOfFour(256));
        assertFalse(new Solution1().isPowerOfFour(2048));
        assertFalse(new Solution1().isPowerOfFour(0));

    }
}
