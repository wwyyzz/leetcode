package Question.Q283;

import java.util.Arrays;

public class Solution1 {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }


}

