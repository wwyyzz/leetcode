/**
 * 434. 字符串中的单词数
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 *
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 *
 * 示例:
 * 输入: "Hello, my name is John"
 * 输出: 5
 */
package Question.Q434_pass;

import java.util.Arrays;

/**
 * 执行用时：
 * 2 ms
 * , 在所有 Java 提交中击败了
 * 32.52%
 * 的用户
 * 内存消耗：
 * 37.7 MB
 * , 在所有 Java 提交中击败了
 * 14.29%
 * 的用户
 */
public class Solution1 {
    public int countSegments(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        //        将String split “ ”
        String[] words = s.split(" +");

        System.out.println(Arrays.toString(words));
//        统计String[] 的长度
        return words.length;
    }
}
