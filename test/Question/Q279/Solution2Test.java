package Question.Q279;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void numSquares() {
        assertEquals(3, new Solution2().numSquares(12));
        assertEquals(2, new Solution2().numSquares(13));
//        assertEquals(2, new Solution2().numSquares(9));
        assertEquals(3, new Solution2().numSquares(19560));
        assertEquals(3, new Solution2().numSquares(19561));
        assertEquals(2, new Solution2().numSquares(19562));
        assertEquals(3, new Solution2().numSquares(19563));
        assertEquals(3, new Solution2().numSquares(19564));
        assertEquals(3, new Solution2().numSquares(19565));
        assertEquals(3, new Solution2().numSquares(19566));
        assertEquals(4, new Solution2().numSquares(19567));
        assertEquals(4, new Solution2().numSquares(19568));
        assertEquals(3, new Solution2().numSquares(19569));
    }
}