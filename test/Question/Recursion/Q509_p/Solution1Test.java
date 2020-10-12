package Question.Recursion.Q509_p;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void fib() {
        assertEquals(1, new Solution1().fib(2));
    }

    @Test
    public void fib2() {
        assertEquals(2, new Solution1().fib(3));
    }

    @Test
    public void fib3() {
        assertEquals(55, new Solution1().fib(10));
    }

    @Test
    public void fib4() {
        //count = 2692537
        assertEquals(832040, new Solution1().fib(30));
    }

    @Test
    public void fib5() {
        assertEquals(1134903170, new Solution1().fib(45));
    }
}