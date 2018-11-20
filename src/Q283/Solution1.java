package Q283;

import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {
//        int[] nums = {9};
//        int[] nums = {1, 2, 3};
//        int[] nums = {1,9 , 9, 9};
        int[] nums = {0, 1, 0, 3, 12};

        new s1().moveZeroes(nums );

        for (Integer i:nums
                ) {
            System.out.println(i);
        }
    }


}

class s1{
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
    }
}