/**
 * 485. 最大连续1的个数
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 *
 * 示例 1:
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 * 注意：
 *
 * 输入的数组只包含 0 和1。
 * 输入数组的长度是正整数，且不超过 10,000。
 */
package Question.Q485;

/**
 * 41 / 41 个通过测试用例
 * 状态：通过
 * 执行用时：7 ms
 *
 * 我的提交执行用时
 * 已经战胜 78.96 % 的 java 提交记录
 */
public class Solution1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int result1 = 0;


        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1){
                result1++;
            }
            else{
            result = Math.max(result, result1);
            result1 = 0;
            }

        }

        result = Math.max(result, result1);
        System.out.println(result);
        return result;
    }
}
