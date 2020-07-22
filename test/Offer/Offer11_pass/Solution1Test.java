package Offer.Offer11_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    int[] numbers1 = {3,4,5,1,2};
    int[] numbers2 = {2,2,2,0,1};

    @Test
    public void minArray() {
        assertEquals(1 , new Solution1().minArray(numbers1));
        assertEquals(0 , new Solution1().minArray(numbers2));
    }
}