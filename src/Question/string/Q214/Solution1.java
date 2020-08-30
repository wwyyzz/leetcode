/**
 214. 最短回文串
 给定一个字符串 s，你可以通过在字符串前面添加字符将其转换为回文串。找到并返回可以用这种方式转换的最短回文串。

 示例 1:

 输入: "aacecaaa"
 输出: "aaacecaaa"
 示例 2:

 输入: "abcd"
 输出: "dcbabcd"
 */

package Question.string.Q214;

/**
 * 算法有问题
 107 / 120 个通过测试用例
 状态：解答错误
 提交时间：几秒前
 输入：
 "abbacd"
 输出：
 "dcabbabbacd"
 预期：
 "dcabbacd"
 */
public class Solution1 {
    public String shortestPalindrome(String s) {
        String result = new String();

        if (isPalindrome(s)) {
            return s;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 1 ; i--) {
            sb.append(s.charAt(i));
        }

        sb = sb.append(s);

        System.out.println(sb);

        for (int i = 0; i < s.length() - 1; i++) {
            String sub = sb.substring(s.length() -2 -i);
            System.out.println("substring   :" + sub);
            if (isPalindrome(sub)) {
                return sub;
            }
        }
        return result;

    }

    private boolean isPalindrome(String s) {
        StringBuilder reverse = new StringBuilder(s).reverse();
        return reverse.toString().compareTo(s) == 0;
    }
}
