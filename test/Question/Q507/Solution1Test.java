package Question.Q507;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void checkPerfectNumber() {
        assertEquals(true, new Solution1().checkPerfectNumber(28));
        assertEquals(false, new Solution1().checkPerfectNumber(27));
        assertEquals(false, new Solution1().checkPerfectNumber(100000000));
    }

    @Test
    public void checkPerfectNumber2() {
        assertEquals(true, new Solution2().checkPerfectNumber(28));
        assertEquals(false, new Solution2().checkPerfectNumber(27));
        assertEquals(false, new Solution2().checkPerfectNumber(100000000));
    }
}