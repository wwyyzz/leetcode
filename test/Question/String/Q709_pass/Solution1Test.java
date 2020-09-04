package Question.String.Q709_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void toLowerCase() {
        assertEquals("hello", new Solution1().toLowerCase("Hello"));
        assertEquals("here", new Solution1().toLowerCase("here"));
        assertEquals("lovely", new Solution1().toLowerCase("LOVELY"));
    }
}