/**
 面试题 17.04. 消失的数字
 数组nums包含从0到n的所有整数，但其中缺了一个。请编写代码找出那个缺失的整数。你有办法在O(n)时间内完成吗？

 注意：本题相对书上原题稍作改动

 示例 1：
 输入：[3,0,1]
 输出：2

 示例 2：
 输入：[9,6,4,2,3,5,7,0,1]
 输出：8
 */

package Interview.Q1704_pass;

/**
 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 38.9 MB, 在所有 Java 提交中击败了89.30%的用户
 */
public class Solution1 {
    public int missingNumber(int[] nums) {
        int result = (1 + nums.length) * nums.length / 2;
        for (int num : nums) {
            result -= num;
        }
        return result;
    }
}
