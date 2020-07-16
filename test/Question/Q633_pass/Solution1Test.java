package Question.Q633_pass;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Ignore
    @Test
    public void judgeSquareSum() {
        assertTrue(new Solution1().judgeSquareSum(5));
        assertFalse(new Solution1().judgeSquareSum(3));
        assertTrue(new Solution1().judgeSquareSum(4));
        assertTrue(new Solution1().judgeSquareSum(100));
        assertTrue(new Solution1().judgeSquareSum(101));
        assertFalse(new Solution1().judgeSquareSum(102));
//        assertEquals(false, new Solution1().judgeSquareSum(2147482647));
    }

    @Test
    public void judgeSquareSum2() {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.sqrt(Integer.MAX_VALUE));

        assertTrue(new Solution2().judgeSquareSum(5));
        assertFalse(new Solution2().judgeSquareSum(3));
        assertTrue(new Solution2().judgeSquareSum(4));
        assertTrue(new Solution2().judgeSquareSum(100));
        assertTrue(new Solution2().judgeSquareSum(101));
        assertFalse(new Solution2().judgeSquareSum(102));
        assertTrue(new Solution2().judgeSquareSum(500));
        assertTrue(new Solution2().judgeSquareSum(17113));
        assertFalse(new Solution2().judgeSquareSum(2147482647));
        assertFalse(new Solution2().judgeSquareSum(2147483646));
    }

    @Test
    public void judgeSquareSum3() {

        assertTrue(new Solution3().judgeSquareSum(5));
        assertFalse(new Solution3().judgeSquareSum(3));
        assertTrue(new Solution3().judgeSquareSum(4));
        assertTrue(new Solution3().judgeSquareSum(100));
        assertTrue(new Solution3().judgeSquareSum(101));
        assertFalse(new Solution3().judgeSquareSum(102));
        assertTrue(new Solution3().judgeSquareSum(500));
        assertTrue(new Solution3().judgeSquareSum(17113));
        assertFalse(new Solution3().judgeSquareSum(2147482647));
        assertFalse(new Solution3().judgeSquareSum(2147483646));
    }

    @Test
    public void judgeSquareSum4() {

        assertTrue(new Solution4().judgeSquareSum(5));
        assertFalse(new Solution4().judgeSquareSum(3));
        assertTrue(new Solution4().judgeSquareSum(4));
        assertTrue(new Solution4().judgeSquareSum(100));
        assertTrue(new Solution4().judgeSquareSum(101));
        assertFalse(new Solution4().judgeSquareSum(102));
        assertTrue(new Solution4().judgeSquareSum(500));
        assertTrue(new Solution4().judgeSquareSum(17113));
        assertFalse(new Solution4().judgeSquareSum(2147482647));
        assertFalse(new Solution4().judgeSquareSum(2147483646));
    }
}