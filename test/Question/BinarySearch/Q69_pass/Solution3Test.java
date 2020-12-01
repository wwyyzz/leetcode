package Question.BinarySearch.Q69_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution3Test {

    @Test
    public void mySqrt() {
        assertEquals(2,new Solution3().mySqrt(4));

    }

    @Test
    public void mySqrt2() {
        assertEquals(2,new Solution3().mySqrt(8));
    }

    @Test
    public void mySqrt3() {
        assertEquals(46340,new Solution3().mySqrt(2147395600));
    }

    @Test
    public void mySqrt4() {
        assertEquals(46339,new Solution3().mySqrt(2147395599));
    }
}