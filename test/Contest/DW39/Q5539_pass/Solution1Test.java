package Contest.DW39.Q5539_pass;

import org.junit.Test;

public class Solution1Test {

    @Test
    public void frequencySort() {
        int[] nums = {1,1,2,2,2,3};

        new Solution1().frequencySort(nums);
    }

    @Test
    public void frequencySort2() {
        int[] nums = {2,3,1,3,2};

        new Solution1().frequencySort(nums);
    }

    @Test
    public void frequencySort3() {
        int[] nums = {-1,1,-6,4,5,-6,1,4,1};

        new Solution1().frequencySort(nums);
    }
}