/**
 * 58. 最后一个单词的长度
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 示例:
 * 输入: "Hello World"
 * 输出: 5
 */
package Question.string.Q58_pass;

/**
 *
 59 / 59 个通过测试用例
 状态：通过
 执行用时：3 ms
 已经战胜 99.85 % 的 java 提交记录
 */
public class Solution1 {
    public int lengthOfLastWord(String s) {
        System.out.println(s);
        System.out.println(s.lastIndexOf(" "));
        System.out.println(s.length());
        s = s.trim();
//        if (s.equals(" ")) {
//            return 0;
//        }
        if ((s.lastIndexOf(" ") == -1 ) || (s.lastIndexOf(" ") == (s.length() - 1))){
            return s.length();
        }
        else {
            return s.length() - s.lastIndexOf(" ") - 1;
        }
    }
}