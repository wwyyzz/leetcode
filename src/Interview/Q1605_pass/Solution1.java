/**
 面试题 16.05. 阶乘尾数
 设计一个算法，算出 n 阶乘有多少个尾随零。

 示例 1:

 输入: 3
 输出: 0
 解释: 3! = 6, 尾数中没有零。
 示例 2:

 输入: 5
 输出: 1
 解释: 5! = 120, 尾数中有 1 个零.
 说明: 你算法的时间复杂度应为 O(log n) 。
 */

package Interview.Q1605_pass;

/**
 执行用时：
 1 ms, 在所有 Java 提交中击败了99.36%的用户
 内存消耗：
 36 MB, 在所有 Java 提交中击败了18.55%的用户
 */
public class Solution1 {
    public int trailingZeroes(int n){
        int result = 0;

        while (n > 0) {
            result += n / 5;
            n = n / 5;
        }

        return result;
    }
}
