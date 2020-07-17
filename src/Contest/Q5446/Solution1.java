package Contest.Q5446;

import java.util.Arrays;

public class Solution1 {
    public int minDifference(int[] nums) {

        if (nums.length < 4){
            return 0;
        }
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length-1];

        int a = max - nums[3];
        int b = nums[nums.length - 4];

        return a > b ? b : a;

    }
}
