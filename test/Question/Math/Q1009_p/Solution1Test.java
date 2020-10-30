package Question.Math.Q1009_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void bitwiseComplement() {
        assertEquals(2, new Solution1().bitwiseComplement(5));
    }

    @Test
    public void bitwiseComplement2() {
        assertEquals(0, new Solution1().bitwiseComplement(7));
    }

    @Test
    public void bitwiseComplement3() {
        assertEquals(5, new Solution1().bitwiseComplement(10));
    }
}