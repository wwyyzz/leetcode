package Question.Q231_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isPowerOfTwo() {
        assertTrue(new Solution1().isPowerOfTwo(1));
        assertTrue(new Solution1().isPowerOfTwo(16));
        assertFalse(new Solution1().isPowerOfTwo(218));
    }

    @Test
    public void isPowerOfTwo2() {
        assertTrue(new Solution2().isPowerOfTwo(1));
        assertTrue(new Solution2().isPowerOfTwo(16));
        assertFalse(new Solution2().isPowerOfTwo(218));
    }
}