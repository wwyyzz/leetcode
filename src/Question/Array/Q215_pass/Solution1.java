/**
 215. 数组中的第K个最大元素
 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。

 示例 1:
 输入: [3,2,1,5,6,4] 和 k = 2
 输出: 5

 示例 2:
 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 输出: 4

 说明:
 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 */

package Question.Array.Q215_pass;

import java.util.Arrays;

/**
 执行用时：
 2 ms, 在所有 Java 提交中击败了90.59%的用户
 内存消耗：
 38.8 MB, 在所有 Java 提交中击败了89.97%的用户
 */
public class Solution1 {
    public int findKthLargest(int[] nums, int k){
        int result = 0;

        Arrays.sort(nums);

        return nums[nums.length -k];

    }
}
