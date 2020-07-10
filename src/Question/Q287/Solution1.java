package Question.Q287;

/**
 * @program: leetcode
 * @description: Question.Q287
 * @author: Jun Wang
 * @create: 2018-12-14 11:25
 */

import java.util.Arrays;

/**
 * 287. 寻找重复数
  * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
 *
 * 示例 1:
 * 输入: [1,3,4,2,2]
 * 输出: 2
 * 示例 2:
 *
 * 输入: [3,1,3,4,2]
 * 输出: 3
 *
 * 说明：
 * 不能更改原数组（假设数组是只读的）。
 * 只能使用额外的 O(1) 的空间。
 * 时间复杂度小于 O(n2) 。
 * 数组中只有一个重复的数字，但它可能不止重复出现一次。
 */
public class Solution1 {
    public int findDuplicate(int[] nums) {
//        双层循环，两两对比元素
//        for 从0 到length - 1

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
            int num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int num1 = nums[j];
                if (num == num1) {
                    return num;
                }
            }
        }
//            for 从 i+1 到 length
//
//                如果num[i] == num [j],则return num[i]
        return 0;
    }
}


class Solution2 {
    public int findDuplicate(int[] nums) {
//        先排序，然后I 和 i+1进行对比，少一次for循环

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }

        return 0;
    }
}