package Question.array.Q283_pass;

import java.util.Arrays;

/**
 *
 21 / 21 个通过测试用例
 状态：通过
 执行用时：6 ms
 内存消耗：40.2 MB
 */
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

                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }


}

