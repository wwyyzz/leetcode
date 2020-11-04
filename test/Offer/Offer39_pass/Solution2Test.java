package Offer.Offer39_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void majorityElement() {
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};

        assertEquals(2, new Solution2().majorityElement(nums));
    }
}