package Question.Offer.Offer17_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    int[] result1 = {1,2,3,4,5,6,7,8,9};

    @Test
    public void printNumbers() {
        assertArrayEquals(result1, new Solution1().printNumbers(1));
    }
}