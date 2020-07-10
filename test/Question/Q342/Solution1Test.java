package Question.Q342;


import org.junit.Test;

import static org.junit.Assert.*;


public class Solution1Test {

    @Test
    public void isPowerOfFour() {
        assertEquals(true,new Solution1().isPowerOfFour(1024));
        assertEquals(false,new Solution1().isPowerOfFour(1025));
        assertEquals(true,new Solution1().isPowerOfFour(16));
        assertEquals(false,new Solution1().isPowerOfFour(17));
        assertEquals(false,new Solution1().isPowerOfFour(100));
        assertEquals(true,new Solution1().isPowerOfFour(256));
        assertEquals(false,new Solution1().isPowerOfFour(2048));
        assertEquals(false,new Solution1().isPowerOfFour(0));

    }
}
