package Question.Q231;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isPowerOfTwo() {
        assertEquals(true, new Solution1().isPowerOfTwo(1));
        assertEquals(true, new Solution1().isPowerOfTwo(16));
        assertEquals(false, new Solution1().isPowerOfTwo(218));
    }

    @Test
    public void isPowerOfTwo2() {
        assertEquals(true, new Solution2().isPowerOfTwo(1));
        assertEquals(true, new Solution2().isPowerOfTwo(16));
        assertEquals(false, new Solution2().isPowerOfTwo(218));
    }
}