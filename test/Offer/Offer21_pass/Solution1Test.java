package Offer.Offer21_pass;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void exchange() {
        int[] nums = {1,2,3,4};
        new Solution1().exchange(nums);
    }

    @Test
    public void exchange2() {
        int[] nums = {1,2,3,4,5,6,7,8,10,11,13};
        new Solution1().exchange(nums);
    }
}