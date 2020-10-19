package Question.Stack.Q844_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void backspaceCompare() {
        String S = "ab#c";
        String T = "ad#c";

        assertTrue(new Solution1().backspaceCompare(S,T));
    }

    @Test
    public void backspaceCompare2() {
        String S = "ab##";
        String T = "c#d#";

        assertTrue(new Solution1().backspaceCompare(S,T));
    }

    @Test
    public void backspaceCompare3() {
        String S = "a##c";
        String T = "#a#c";

        assertTrue(new Solution1().backspaceCompare(S,T));
    }

    @Test
    public void backspaceCompare4() {
        String S = "a#c";
        String T = "b";

        assertFalse(new Solution1().backspaceCompare(S,T));
    }
}