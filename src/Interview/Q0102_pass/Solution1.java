/**
 面试题 01.02. 判定是否互为字符重排
 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。

 示例 1：
 输入: s1 = "abc", s2 = "bca"
 输出: true

 示例 2：
 输入: s1 = "abc", s2 = "bad"
 输出: false

 说明：
 0 <= len(s1) <= 100
 0 <= len(s2) <= 100
 */

package Interview.Q0102_pass;

import java.util.Arrays;

/**
 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 36.3 MB, 在所有 Java 提交中击败了73.56%的用户
 */
public class Solution1 {
    public boolean CheckPermutation(String s1, String s2){
        if (s1.length() != s2.length()) {
            return false;
        }
        boolean result = true;

        char[] chars_s1 = s1.toCharArray();
        char[] chars_s2 = s2.toCharArray();

        Arrays.sort(chars_s1);
        Arrays.sort(chars_s2);

        for (int i = 0; i < chars_s1.length; i++) {
            if (chars_s1[i] != chars_s2[i]) {
                return false;
            }
        }

        return result;

    }
}
