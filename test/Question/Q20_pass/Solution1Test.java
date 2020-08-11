package Question.Q20_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isValid() {
        assertEquals(true, new Solution1().isValid("()"));
        assertEquals(true, new Solution1().isValid("()[]{}"));
        assertEquals(false, new Solution1().isValid("([)()[])"));
        assertEquals(true, new Solution1().isValid("{[]}"));
        assertEquals(false, new Solution1().isValid("{[((])[]{}]}"));
    }
}