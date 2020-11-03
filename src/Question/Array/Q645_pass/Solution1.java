/**
 645. 错误的集合
 集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，
 导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，
 导致集合丢失了一个整数并且有一个元素重复。

 给定一个数组 nums 代表了集合 S 发生错误后的结果。
 你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。

 示例 1:
 输入: nums = [1,2,2,4]
 输出: [2,3]

 注意:
 给定数组的长度范围是 [2, 10000]。
 给定的数组是无序的。
 */

package Question.Array.Q645_pass;

import java.util.Arrays;

/**
 执行用时：
 11 ms, 在所有 Java 提交中击败了47.00%的用户
 内存消耗：
 39.7 MB, 在所有 Java 提交中击败了93.89%的用户
 */
public class Solution1 {
    public int[] findErrorNums(int[] nums){
        int[] result = new int[2];

        int step ;

        int repeat = 0;

        Arrays.sort(nums);
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            step = nums[i] - nums[i - 1];

            if (step == 0 ) {
                repeat = nums[i];
            }

            sum += nums[i];
        }

        System.out.println(sum);

        int miss = (1 + nums.length) * nums.length / 2 - (sum -repeat);
        System.out.println(miss);

        result[0] = repeat;
        result[1] = miss;
        System.out.println(Arrays.toString(result));
        return result;
    }
}
