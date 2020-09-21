package Offer.Offer05_pass;

/**
 剑指 Offer 05. 替换空格
 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

 示例 1：
 输入：s = "We are happy."
 输出："We%20are%20happy."

 限制：
 0 <= s 的长度 <= 10000
 */

/**
 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 36.7 MB, 在所有 Java 提交中击败了51.19%的用户

 使用StringBuilder 的append 不用使用String 的 +，效率更高
 */
public class Solution2 {
    public String replaceSpace(String s){
//        使用StringBuilder 的append 不用使用String 的 +，效率更高
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result.append("%20");
            } else {
                result.append(c);
            }
        }

        System.out.println(result);
        return result.toString();
    }
}
