/**
 * 125. 验证回文串
 * 题目描述提示帮助提交记录社区讨论阅读解答
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 *
 * 476 / 476 个通过测试用例
 * 状态：通过
 * 执行用时：9 ms
 *
 *
 * StringBuilder 没有compareTo（）方法，需要使用String来compare
 */

package Question.Q125_pass;

public class Solution1 {
    public boolean isPalindrome(String s) {

        StringBuilder sb2 = new StringBuilder();


        for (char c:s.toLowerCase().toCharArray()
             ) {
            if ( (c >= 48 && c <=57) || (c>=97 && c <= 122)) {
                sb2.append(c);
            }

        }

        String s2 = new String(sb2);
        String s3 = new String(sb2.reverse());

        System.out.println("sb2         = " + s2);
        System.out.println("sb2 reverse = " + s3);
        System.out.println(s2.compareTo(s3));
//        return (sb2.toString() == (sb2.reverse().toString())?(true):(false));

        return (s2.compareTo(s3) == 0)?(true):(false);
    }
}
