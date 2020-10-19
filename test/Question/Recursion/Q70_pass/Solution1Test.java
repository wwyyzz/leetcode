package Question.Recursion.Q70_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void climbStairs() {
        assertEquals(2, new Solution1().climbStairs(2));
    }

    @Test
    public void climbStairs2() {
        assertEquals(3, new Solution1().climbStairs(3));
    }

    @Test
    public void climbStairs3() {
        assertEquals(5, new Solution1().climbStairs(4));
    }

    @Test
    public void climbStairs4() {
        assertEquals(8, new Solution1().climbStairs(5));
    }
}