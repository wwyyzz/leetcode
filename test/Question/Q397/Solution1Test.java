package Question.Q397;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void integerReplacement() {
        assertEquals(3, new Solution1().integerReplacement(8));
    }

    @Test
    public void integerReplacement2() {
        assertEquals(4, new Solution1().integerReplacement(7));
    }

    @Test
    public void integerReplacement3() {
        assertEquals(17, new Solution1().integerReplacement(65535));
    }
}