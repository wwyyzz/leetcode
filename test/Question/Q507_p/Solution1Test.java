package Question.Q507_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void checkPerfectNumber() {
        assertTrue(new Solution1().checkPerfectNumber(28));
        assertFalse(new Solution1().checkPerfectNumber(27));
        assertFalse(new Solution1().checkPerfectNumber(100000000));
    }

    @Test
    public void checkPerfectNumber2() {
        assertTrue(new Solution2().checkPerfectNumber(28));
        assertFalse(new Solution2().checkPerfectNumber(27));
        assertFalse(new Solution2().checkPerfectNumber(100000000));
    }
}