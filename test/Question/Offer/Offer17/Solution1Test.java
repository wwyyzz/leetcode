package Question.Offer.Offer17;

import org.junit.Test;

import static Question.Offer.Offer17.Solution1.*;
import static org.junit.Assert.*;

public class Solution1Test {

    int[] result1 = {1,2,3,4,5,6,7,8,9};

    @Test
    public void printNumbers() {
        assertArrayEquals(result1, new Solution1().printNumbers(1));
    }
}