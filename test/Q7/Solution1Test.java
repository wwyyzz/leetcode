package Q7;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {


    @Test(timeout = 100)
    public void reverse() {
        assertEquals(321, new Solution2().reverse(123));
        assertEquals(-321, new Solution2().reverse(-123));
        assertEquals(21, new Solution2().reverse(120));
        assertEquals(0, new Solution2().reverse(
                1534236469));
    }
}