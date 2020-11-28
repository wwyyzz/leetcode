/**
 剑指 Offer 50. 第一个只出现一次的字符
 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。

 示例:
 s = "abaccdeff"
 返回 "b"

 s = ""
 返回 " "

 限制：
 0 <= s 的长度 <= 50000
 */

package Offer.Offer50_pass;

/**
 执行用时：
 33 ms, 在所有 Java 提交中击败了31.00%的用户
 内存消耗：
 38.6 MB, 在所有 Java 提交中击败了96.67%的用户
 */
public class Solution1 {
    public char firstUniqChar(String s){
        char result = ' ';

        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                result = s.charAt(i);
                break;
            }
        }


        return result;

    }
}
