package Question.Greedy.Q402;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void removeKdigits() {
        String num = "1432219";
        assertEquals("1219", new Solution1().removeKdigits(num, 3));
    }
}