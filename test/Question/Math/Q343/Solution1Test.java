package Question.Math.Q343;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void integerBreak() {
        assertEquals(36, new Solution1().integerBreak(10));
        assertEquals(1, new Solution1().integerBreak(2));
        assertEquals(18, new Solution1().integerBreak(8));
    }
}