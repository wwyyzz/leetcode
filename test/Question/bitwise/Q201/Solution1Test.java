package Question.bitwise.Q201;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void rangeBitwiseAnd() {
        assertEquals(4, new Solution1().rangeBitwiseAnd(5,7));
        assertEquals(0, new Solution1().rangeBitwiseAnd(0,1));
    }
}