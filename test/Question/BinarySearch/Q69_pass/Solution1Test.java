package Question.BinarySearch.Q69_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void mySqrt() {
        assertEquals(2,new Solution1().mySqrt(4));
        assertEquals(2,new Solution1().mySqrt(8));
        assertEquals(46340,new Solution1().mySqrt(2147395600));

    }

    @Test
    public void mySqrt2() {
        assertEquals(2,new Solution2().mySqrt(4));
        assertEquals(2,new Solution2().mySqrt(8));
        assertEquals(46340,new Solution2().mySqrt(2147395600));
    }
}

