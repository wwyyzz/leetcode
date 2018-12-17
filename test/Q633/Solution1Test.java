package Q633;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void judgeSquareSum() {
        assertEquals(true, new Solution1().judgeSquareSum(5));
        assertEquals(false, new Solution1().judgeSquareSum(3));
        assertEquals(true, new Solution1().judgeSquareSum(4));
        assertEquals(true, new Solution1().judgeSquareSum(100));
        assertEquals(true, new Solution1().judgeSquareSum(101));
        assertEquals(false, new Solution1().judgeSquareSum(102));
//        assertEquals(false, new Solution1().judgeSquareSum(2147482647));
    }

    @Test
    public void judgeSquareSum2() {
        assertEquals(true, new Solution2().judgeSquareSum(5));
        assertEquals(false, new Solution2().judgeSquareSum(3));
        assertEquals(true, new Solution2().judgeSquareSum(4));
        assertEquals(true, new Solution2().judgeSquareSum(100));
        assertEquals(true, new Solution2().judgeSquareSum(101));
        assertEquals(false, new Solution2().judgeSquareSum(102));
        assertEquals(true, new Solution2().judgeSquareSum(500));
        assertEquals(true, new Solution2().judgeSquareSum(17113));
        assertEquals(false, new Solution2().judgeSquareSum(2147482647));
        assertEquals(false, new Solution2().judgeSquareSum(2147483646));
    }
}