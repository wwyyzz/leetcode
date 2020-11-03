package Offer.Offer10_pass;

import Question.Recursion.Q509_pass.Solution2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {


    @Test
    public void fib4() {
        //count = 59
        assertEquals(832040, new Solution2().fib(30));
    }

    @Test
    public void fib5() {
        assertEquals(55, new Solution2().fib(10));
    }

    @Test
    public void fib52() {
        assertEquals(1134903170, new Solution2().fib(45));
    }
}