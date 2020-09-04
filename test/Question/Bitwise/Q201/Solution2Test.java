package Question.Bitwise.Q201;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void rangeBitwiseAnd() {
        assertEquals(4, new Solution2().rangeBitwiseAnd(5,7));
        assertEquals(0, new Solution2().rangeBitwiseAnd(0,1));
        assertEquals(0, new Solution2().rangeBitwiseAnd(1,1000));
    }
}