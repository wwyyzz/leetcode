package Question.Math.Q258_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void addDigits() {
        assertEquals(2, new Solution1().addDigits(38));
    }

    @Test
    public void addDigits2() {
        assertEquals(6, new Solution1().addDigits(456));
    }
}