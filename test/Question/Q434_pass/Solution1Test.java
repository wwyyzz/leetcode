package Question.Q434_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void countSegments() {
        assertEquals(5, new Solution1().countSegments("Hello, my name is John"));
        assertEquals(6, new Solution1().countSegments("a b c d e f "));
        assertEquals(0, new Solution1().countSegments(""));
        assertEquals(1, new Solution1().countSegments("a "));
        assertEquals(6, new Solution1().countSegments(", , , ,        a, eaefa"));
        assertEquals(2, new Solution1().countSegments("    foo    bar"));

    }
}