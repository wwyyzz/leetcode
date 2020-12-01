/**
 34. 在排序数组中查找元素的第一个和最后一个位置
 给定一个按照升序排列的整数数组 nums，和一个目标值 target。
 找出给定目标值在数组中的开始位置和结束位置。
 如果数组中不存在目标值 target，返回 [-1, -1]。

 进阶：
 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？

 示例 1：
 输入：nums = [5,7,7,8,8,10], target = 8
 输出：[3,4]

 示例 2：
 输入：nums = [5,7,7,8,8,10], target = 6
 输出：[-1,-1]

 示例 3：
 输入：nums = [], target = 0
 输出：[-1,-1]

 提示：
 0 <= nums.length <= 105
 -109 <= nums[i] <= 109
 nums 是一个非递减数组
 -109 <= target <= 109
 */

package Question.Array.Q34;

import java.util.Arrays;

/**
 执行用时：
 1 ms, 在所有 Java 提交中击败了15.15%的用户
 内存消耗：
 41.7 MB, 在所有 Java 提交中击败了75.80%的用户

 不满足
 进阶：
 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
 */
public class Solution1 {
    public int[] searchRange(int[] nums, int target){
        int[] result = new int[]{-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                result[1] = i;
                break;
            }
        }
        System.out.println(Arrays.toString(result));
        return  result;

    }
}
