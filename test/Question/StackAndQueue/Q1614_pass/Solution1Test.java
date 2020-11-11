package Question.StackAndQueue.Q1614_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void maxDepth() {
        assertEquals(3, new Solution1().maxDepth( "(1+(2*3)+((8)/4))+1"));
    }

    @Test
    public void maxDepth2() {
        assertEquals(3, new Solution1().maxDepth("(1)+((2))+(((3)))"));
    }

    @Test
    public void maxDepth3() {
        assertEquals(1, new Solution1().maxDepth("1+(2*3)/(2-1)"));
    }

    @Test
    public void maxDepth4() {
        assertEquals(0, new Solution1().maxDepth("1"));
    }
}