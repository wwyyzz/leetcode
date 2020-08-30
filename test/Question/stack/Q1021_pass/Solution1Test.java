package Question.stack.Q1021_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void removeOuterParentheses() {
        assertEquals("()()()", new Solution1().removeOuterParentheses("(()())(())"));
    }

    @Test
    public void removeOuterParentheses2() {
        assertEquals("()()()()(())", new Solution1().removeOuterParentheses("(()())(())(()(()))"));
    }

    @Test
    public void removeOuterParentheses3() {
        assertEquals("", new Solution1().removeOuterParentheses("()()"));
    }
}