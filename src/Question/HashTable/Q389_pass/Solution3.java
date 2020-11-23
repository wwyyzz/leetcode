/**
 * 389. 找不同
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 *
 * 示例:
 *
 * 输入：
 * s = "abcd"
 * t = "abcde"
 *
 * 输出：
 * e
 *
 * 解释：
 * 'e' 是那个被添加的字母。
 */
package Question.HashTable.Q389_pass;

/**
 *
 54 / 54 个通过测试用例
 状态：通过
 执行用时：6 ms
 已经战胜 83.28 % 的 java 提交记录
 */
public class Solution3 {
    public char findTheDifference(String s, String t) {
//        将s求和
//        将t求和
//        t-s的值转为char

        int sum = 0;

        for (char c :t.toCharArray()
        ) {
            sum += c;
        }

        for (char c :s.toCharArray()
        ) {
            sum -= c;
        }

        return (char)sum;
    }
}

