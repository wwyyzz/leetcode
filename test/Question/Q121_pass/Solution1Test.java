package Question.Q121_pass;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void maxProfit() {
        int[] nums = {7,1,5,3,6,4};

        assertEquals(5, new Solution1().maxProfit(nums));
    }

    @Test
    public void maxProfit2() {
        int[] nums = {7,6,4,3,1};

        assertEquals(0, new Solution1().maxProfit(nums));
    }
}