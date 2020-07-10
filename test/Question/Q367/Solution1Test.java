package Question.Q367;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isPerfectSquare() {
        assertTrue(new Solution1().isPerfectSquare(16));
        assertFalse(new Solution1().isPerfectSquare(14));
        assertFalse(new Solution1().isPerfectSquare(2147483647));
        assertTrue(new Solution1().isPerfectSquare(
                2147395600));
    }
}