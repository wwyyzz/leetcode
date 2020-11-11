package Question.StackAndQueue.Q150_pass;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {

    @Test
    public void evalRPN() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        assertEquals(9, new Solution2().evalRPN(tokens) );
    }

    @Test
    public void evalRPN2() {
        String[] tokens = {"4", "13", "5", "/", "+"};
        assertEquals(6, new Solution2().evalRPN(tokens) );
    }

    @Test
    public void evalRPN3() {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        assertEquals(22, new Solution2().evalRPN(tokens) );
    }
}