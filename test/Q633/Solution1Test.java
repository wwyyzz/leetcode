package Q633;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Ignore
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
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.sqrt(Integer.MAX_VALUE));

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

    @Test
    public void judgeSquareSum3() {

        assertEquals(true, new Solution3().judgeSquareSum(5));
        assertEquals(false, new Solution3().judgeSquareSum(3));
        assertEquals(true, new Solution3().judgeSquareSum(4));
        assertEquals(true, new Solution3().judgeSquareSum(100));
        assertEquals(true, new Solution3().judgeSquareSum(101));
        assertEquals(false, new Solution3().judgeSquareSum(102));
        assertEquals(true, new Solution3().judgeSquareSum(500));
        assertEquals(true, new Solution3().judgeSquareSum(17113));
        assertEquals(false, new Solution3().judgeSquareSum(2147482647));
        assertEquals(false, new Solution3().judgeSquareSum(2147483646));
    }

    @Test
    public void judgeSquareSum4() {

        assertEquals(true, new Solution4().judgeSquareSum(5));
        assertEquals(false, new Solution4().judgeSquareSum(3));
        assertEquals(true, new Solution4().judgeSquareSum(4));
        assertEquals(true, new Solution4().judgeSquareSum(100));
        assertEquals(true, new Solution4().judgeSquareSum(101));
        assertEquals(false, new Solution4().judgeSquareSum(102));
        assertEquals(true, new Solution4().judgeSquareSum(500));
        assertEquals(true, new Solution4().judgeSquareSum(17113));
        assertEquals(false, new Solution4().judgeSquareSum(2147482647));
        assertEquals(false, new Solution4().judgeSquareSum(2147483646));
    }
}