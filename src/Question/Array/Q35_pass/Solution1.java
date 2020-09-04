package Question.Array.Q35_pass;

/**
 * 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 * 输入: [1,3,5,6], 5
 * 输出: 2
 *
 * 示例 2:
 * 输入: [1,3,5,6], 2
 * 输出: 1
 *
 * 示例 3:
 * 输入: [1,3,5,6], 7
 * 输出: 4
 *
 * 示例 4:
 * 输入: [1,3,5,6], 0
 * 输出: 0
 */

/**
 * 62 / 62 个通过测试用例
 * 状态：通过
 * 执行用时：5 ms
 * 已经战胜 69.18 % 的 java 提交记录
 */
public class Solution1 {
    public int searchInsert(int[] nums, int target) {
//        for遍历数组
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            //        if （元素 > = target），返回index
            if (num >= target) {
                return i;
            }

        }
//        如果没有找到，则返回nums.length
        return nums.length;
    }

}
