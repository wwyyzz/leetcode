package Q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 17};

        int target = 9;
        int[] result = new s2().twoSum(nums, target );

        for (Integer i:result
             ) {
            System.out.println(i);
        }
    }
}


class s2 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {1,1};
        Map<Integer,Integer> nums_map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            nums_map.put(nums[i], i);
            }
        System.out.println("hums_map = "+ nums_map);

//        Iterator iter = nums_map.entrySet().iterator();
//        while (iter.hasNext()){
//
//        }


        int complement = 0;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (nums_map.containsKey(complement) && nums_map.get(complement)!= i){
                return new int[]{i, nums_map.get(complement)};
            }
        }


        return result;
    }
}