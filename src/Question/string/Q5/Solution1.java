/**
 5. 最长回文子串
 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

 示例 1：

 输入: "babad"
 输出: "bab"
 注意: "aba" 也是一个有效答案。

 示例 2：
 输入: "cbbd"
 输出: "bb"
 */

package Question.string.Q5;

/**
 63 / 103 个通过测试用例
 状态：超出时间限制
 */
public class Solution1 {
    public String longestPalindrome(String s){
        String result = new String();

        int len = s.length();

        for (int i = len; i > 1 ; i--) {

            for (int j = 0; j <= len - i ; j++) {
                String sub = s.substring(j, j+i);
//                System.out.println("substring :" + sub);
                StringBuilder reverse = new StringBuilder(sub).reverse();
//                System.out.println("reverse  :" + reverse);
                if (sub.compareTo(reverse.toString()) == 0) {
                    return sub;
                }
            }

        }


        return result;

    }
}
