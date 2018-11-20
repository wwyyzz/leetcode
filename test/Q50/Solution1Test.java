package Q50;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void myPow() {
        assertEquals(8.0, new Solution1().myPow(2.0, 3),0.01);
        assertEquals(0.25, new Solution1().myPow(2.0, -2),0.01);
        assertEquals(0.00001, new Solution1().myPow(0.00001, 2147483647),0.01);

    }
}