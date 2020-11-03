package Offer.Offer10_pass;

import Question.Recursion.Q509_pass.Solution3;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution4Test {

    @Test
    public void fib() {
        //count = 59
        assertEquals(832040, new Solution4().fib(30));
    }

    @Test
    public void fib2() {
        //count = 59
        assertEquals(55, new Solution4().fib(10));
    }

    @Test
    public void fib52() {
        assertEquals(1134903170, new Solution3().fib(45));
    }
}