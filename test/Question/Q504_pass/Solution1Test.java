package Question.Q504_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void convertToBase7() {
        assertEquals("202", new Solution1().convertToBase7(100));
    }

    @Test
    public void convertToBase72() {
        assertEquals("203", new Solution1().convertToBase7(101));
    }

    @Test
    public void convertToBase73() {
        assertEquals("-10", new Solution1().convertToBase7(-7));
    }

    @Test
    public void convertToBase74() {
        assertEquals("10", new Solution1().convertToBase7(7));
    }
}