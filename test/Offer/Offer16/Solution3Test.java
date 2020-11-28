package Offer.Offer16;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution3Test {

    @Test
    public void myPow() {
        new Solution3().myPow(1.0000,-2147483648);
    }

    @Test
    public void myPow2() {
        new Solution3().myPow(0.00001,2147483647);
    }

    @Test
    public void myPow3() {
        new Solution3().myPow(2,10);
    }
    @Test
    public void myPow4() {
        new Solution3().myPow(2,9);
    }

    @Test
    public void myPow5() {
        new Solution3().myPow(-2,10);
    }

    @Test
    public void myPow6() {
        new Solution3().myPow(2,77);
    }
}