/**
 * 171. Excel表列序号
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 *
 * 例如，
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 *
 * 示例 1:
 *
 * 输入: "A"
 * 输出: 1
 *
 * 示例 2:
 * 输入: "AB"
 * 输出: 28
 *
 * 示例 3:
 * 输入: "ZY"
 * 输出: 701
 */
package Q171;

/**
 *
 1000 / 1000 个通过测试用例
 状态：通过
 执行用时：1 ms

 我的提交执行用时
 已经战胜 100.00 % 的 java 提交记录
 */
public class Solution1 {
    public int titleToNumber(String s) {
//        将字符串s，转为char数组
//                遍历char数组
//                    sum +=（将字符转为int）* 26的（数组length-1次方）
        char[] sequence = s.toCharArray();

        int sum = 0;
        for (int i = 0; i < sequence.length; i++) {
            sum += (sequence[i] - 64) * Math.pow(26, sequence.length -1 - i);
        }

        System.out.println(sum);
        return sum;
    }
}
