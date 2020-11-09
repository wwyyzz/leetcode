/**
 剑指 Offer 58 - II. 左旋转字符串
 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。

 示例 1：
 输入: s = "abcdefg", k = 2
 输出: "cdefgab"

 示例 2：
 输入: s = "lrloseumgh", k = 6
 输出: "umghlrlose"

 限制：
 1 <= k < s.length <= 10000
 */

package Offer.Offer58_pass;

/**
 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 38.2 MB, 在所有 Java 提交中击败了90.20%的用户
 */
public class Solution2 {
    public String reverseLeftWords(String s, int n){

        s = s.substring(n) + s.substring(0,n);
        System.out.println(s);
        return s;

    }
}
