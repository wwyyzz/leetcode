package Question.Q367;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isPerfectSquare() {
        assertEquals(true, new Solution1().isPerfectSquare(16));
        assertEquals(false, new Solution1().isPerfectSquare(14));
        assertEquals(false, new Solution1().isPerfectSquare(2147483647));
        assertEquals(true, new Solution1().isPerfectSquare(
                2147395600));
    }
}