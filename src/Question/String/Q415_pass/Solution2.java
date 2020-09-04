/**
 * 415. 字符串相加
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 *
 * 注意：
 *
 * num1 和num2 的长度都小于 5100.
 * num1 和num2 都只包含数字 0-9.
 * num1 和num2 都不包含任何前导零。
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 */
package Question.String.Q415_pass;

/**
 * 124 / 315 个通过测试用例
 * 状态：执行出错
 * 提交时间：0 分钟之前
 * 执行出错信息：
 * Line 3: java.lang.NumberFormatException: For input string: "6913259244"
 * 最后执行的输入：
 * "6913259244"
 * "71103343"
 */
public class Solution2 {
    String addStrings(String num1, String num2) {


        long n1 = Integer.valueOf(num1);
        long n2 = Integer.valueOf(num2);
        long n = n1 + n2;
        String result = "" + n;
        System.out.println(result);
        return result;
    }
}
