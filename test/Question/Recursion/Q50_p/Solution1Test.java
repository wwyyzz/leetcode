package Question.Recursion.Q50_p;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void myPow() {
        double result = new Solution1().myPow(2.0, 10);
        System.out.println(result);
    }

    @Test
    public void myPow2() {
        double result = new Solution1().myPow(2.1, 3);
        System.out.println(result);
    }

    @Test
    public void myPow3() {
        double result = new Solution1().myPow(2.0, -2);
        System.out.println(result);
    }

    @Test
    public void myPow4() {
        double result = new Solution1().myPow(0.00001, 2147483647);
        System.out.println(result);
    }
}