/**
 1281. 整数的各位积和之差
 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。



 示例 1：

 输入：n = 234
 输出：15
 解释：
 各位数之积 = 2 * 3 * 4 = 24
 各位数之和 = 2 + 3 + 4 = 9
 结果 = 24 - 9 = 15
 示例 2：

 输入：n = 4421
 输出：21
 解释：
 各位数之积 = 4 * 4 * 2 * 1 = 32
 各位数之和 = 4 + 4 + 2 + 1 = 11
 结果 = 32 - 11 = 21


 提示：

 1 <= n <= 10^5
 */

package Question.math.Q1281_pass;

/**
 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 36.7 MB, 在所有 Java 提交中击败了8.16%的用户
 */
public class Solution1 {
    public int subtractProductAndSum(int n){

        int result = 0;
        int sum = 0;
        int product = 1;

        while( n > 0){
            int digital = n % 10;
            sum += digital;
            product *= digital;

            n = n / 10;
        }

        result = product - sum;

        return result;

    }
}
