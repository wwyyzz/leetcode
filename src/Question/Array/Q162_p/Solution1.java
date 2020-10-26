/**
 162. 寻找峰值
 峰值元素是指其值大于左右相邻值的元素。
 给定一个输入数组 nums，其中 nums[i] ≠ nums[i+1]，找到峰值元素并返回其索引。
 数组可能包含多个峰值，在这种情况下，返回任何一个峰值所在位置即可。
 你可以假设 nums[-1] = nums[n] = -∞。

 示例 1:
 输入: nums = [1,2,3,1]
 输出: 2
 解释: 3 是峰值元素，你的函数应该返回其索引 2。

 示例 2:
 输入: nums = [1,2,1,3,5,6,4]
 输出: 1 或 5
 解释: 你的函数可以返回索引 1，其峰值元素为 2；
 或者返回索引 5， 其峰值元素为 6。

 说明:
 你的解法应该是 O(logN) 时间复杂度的。
 */

package Question.Array.Q162_p;

/**

 */
public class Solution1 {
    public int findPeakElement(int[] nums){
        int result = 0;

        int[] new_nums = new int[nums.length + 2];
        new_nums[0] = - Integer.MAX_VALUE;
        new_nums[new_nums.length - 1] = - Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            new_nums[i + 1] = nums[i];
        }

        for (int i = 1; i < new_nums.length - 1; i++) {
            if ((new_nums[i - 1] < new_nums[i]) &&
                    (new_nums[i] > new_nums[i + 1])) {
                return i - 1;
            }
        }
        return result;

    }
}
