package Q1;

import java.util.ArrayList;

public class solution2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList();
        nums.add(2);
        nums.add(9);
        nums.add(7);
        nums.add(17);

        int target = 9;
        int[] result = new Solution2().twoSum(nums, target );

        for (Integer i:result
             ) {
            System.out.println(i);
        }
    }
}


class Solution2 {
    public int[] twoSum(ArrayList<Integer> nums, int target) {
        int[] result = {1,1};
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (target == nums.get(i) + nums.get(j)){
                    result[0] = i + 1;
                    result[1] = j + 1;
                }
            }
        }

        return result;
    }
}