package Question.string.Q415_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void addStrings() {
        assertEquals("246",new Solution1().addStrings("123","123"));
        assertEquals("492",new Solution1().addStrings("246","246"));
        assertEquals("1492",new Solution1().addStrings("1246","246"));
    }
}