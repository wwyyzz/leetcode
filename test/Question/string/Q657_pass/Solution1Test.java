package Question.string.Q657_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void judgeCircle() {
        assertTrue(new Solution1().judgeCircle("UD"));
        assertFalse(new Solution1().judgeCircle("LL"));
    }
}