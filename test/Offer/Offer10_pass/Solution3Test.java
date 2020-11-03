package Offer.Offer10_pass;

import Question.Recursion.Q509_pass.Solution3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution3Test {

    @Test
    public void fib4() {
        //count = 59
        assertEquals(832040, new Solution3().fib(30));
    }

    @Test
    public void fib5() {
        assertEquals(55, new Solution3().fib(10));
    }

    @Test
    public void fib52() {
        assertEquals(1134903170, new Solution3().fib(45));
    }
}