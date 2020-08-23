package Question.Q1342_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void numberOfSteps() {
        assertEquals(6, new Solution1().numberOfSteps(14));
        assertEquals(4, new Solution1().numberOfSteps(8));
        assertEquals(42, new Solution1().numberOfSteps(1234567890));
    }
}