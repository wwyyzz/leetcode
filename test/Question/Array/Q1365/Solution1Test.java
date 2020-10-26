package Question.Array.Q1365;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void smallerNumbersThanCurrent() {
        int[] nums ={8, 1, 2,2,3};
        new Solution1().smallerNumbersThanCurrent(nums);
    }

    @Test
    public void smallerNumbersThanCurrent2() {
        int[] nums ={6,5,4,8};
        new Solution1().smallerNumbersThanCurrent(nums);
    }

    @Test
    public void smallerNumbersThanCurrent3() {
        int[] nums ={7,7,7,7};
        new Solution1().smallerNumbersThanCurrent(nums);
    }
}