package Q1;

import java.util.ArrayList;

public class solution1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 19};
        int target = 9;

        int[] result = new Solution1().twoSum(nums, target );

        for (Integer i:result
             ) {
            System.out.println(i);
        }
    }
}

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

