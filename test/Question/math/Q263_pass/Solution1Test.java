package Question.math.Q263_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isUgly() {
        assertTrue(new Solution1().isUgly(6));
        assertTrue(new Solution1().isUgly(8));
        assertFalse(new Solution1().isUgly(14));
    }
}