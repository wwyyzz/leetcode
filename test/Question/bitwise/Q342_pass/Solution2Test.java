package Question.bitwise.Q342_pass;


import org.junit.Test;

import static org.junit.Assert.*;


public class Solution2Test {


    @Test
    public void isPowerOfFour() {

        assertTrue(new Solution2().isPowerOfFour(1024));
        assertFalse(new Solution2().isPowerOfFour(1025));
        assertTrue(new Solution2().isPowerOfFour(16));
        assertFalse(new Solution2().isPowerOfFour(17));
        assertFalse(new Solution2().isPowerOfFour(100));
        assertTrue(new Solution2().isPowerOfFour(256));
        assertFalse(new Solution2().isPowerOfFour(2048));
        assertFalse(new Solution2().isPowerOfFour(0));
    }
}
