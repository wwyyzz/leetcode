package Question.Q263;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isUgly() {
        assertEquals(true, new Solution1().isUgly(6));
        assertEquals(true, new Solution1().isUgly(8));
        assertEquals(false, new Solution1().isUgly(14));
    }
}