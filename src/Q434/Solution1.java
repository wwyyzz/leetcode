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
package Q434;

import java.util.Arrays;

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
