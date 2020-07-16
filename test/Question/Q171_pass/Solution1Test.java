package Question.Q171_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void titleToNumber() {
        assertEquals(1, new Solution1().titleToNumber("A"));
        assertEquals(26, new Solution1().titleToNumber("Z"));
        assertEquals(27, new Solution1().titleToNumber("AA"));
        assertEquals(28, new Solution1().titleToNumber("AB"));
    }
}