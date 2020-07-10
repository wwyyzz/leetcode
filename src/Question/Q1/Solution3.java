package Question.Q1;

import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        int[] nums = {10, 11, 2, 55, 7, 11, 32, 19};
        int target = 9;

        int[] result = new s3().twoSum(nums, target );

        for (Integer i:result
             ) {
            System.out.println(i);
        }
    }
}

class s3 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("map:" + map.entrySet());

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}

