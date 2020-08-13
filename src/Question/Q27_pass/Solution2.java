package Question.Q27_pass;

import java.util.Arrays;

/**
 *
 113 / 113 个通过测试用例
 状态：通过
 执行用时：0 ms
 内存消耗：38.2 MB
 */
public class Solution2 {
    public int removeElement(int[] nums, int val) {
        System.out.println(Arrays.toString(nums));
        int result = 0;
        int[] remove = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                remove[result] = nums[i];
                result++;
            }
        }
        System.out.println(Arrays.toString(remove));
        nums = Arrays.copyOf(remove, result);
//        for (int i = 0; i < remove.length; i++) {
//            nums[i] = remove[i];
//        }
        System.out.println(Arrays.toString(nums));
        return result;
    }
}
