package Q1;

import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 19};
        int target = 13;

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
        System.out.println("map:");
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        System.out.println(map.entrySet());
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

