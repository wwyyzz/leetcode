/**
 * 9. 回文数
 * 题目描述提示帮助提交记录社区讨论阅读解答
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 * * 输入: 121
 * 输出: true
 *
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 *
 * 示例 3:
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 *
 * 11509 / 11509 个通过测试用例
 * 状态：通过
 * 执行用时：242 ms
 * 我的提交执行用时
 * 已经战胜 12.99 % 的 java 提交记录
 *
 * 进阶:
 *
 * 你能不将整数转为字符串来解决这个问题吗？
 *
 */
package Question.Q9_pass;

public class Solution1 {
    public boolean isPalindrome(int x) {
        String s = new String("") + x;
        System.out.println(s);

        StringBuilder sb = new StringBuilder(s).reverse();
        String s_reverse = new String(sb);


        return (s.compareTo(s_reverse) == 0)?(true):(false);
    }
}


/**
 * 11509 / 11509 个通过测试用例
 * 状态：通过
 * 执行用时：102 ms
 *
 * 我的提交执行用时
 * 已经战胜 97.33 % 的 java 提交记录
 */
class Solution2 {
    public boolean isPalindrome(int x) {

        if (x == 0){
            return true;
        }else if (x < 0 || x % 10 == 0){
            return false;
        }

        int xx = x;
        int reverse = 0;
        while (xx != 0){
            reverse = reverse * 10 + xx % 10;
            xx = xx / 10;
        }
        System.out.println(reverse);

        return (x == reverse)?(true):(false);
    }
}

/**
 *
 11509 / 11509 个通过测试用例
 状态：通过
 执行用时：100 ms

 我的提交执行用时
 已经战胜 97.99 % 的 java 提交记录
 */

class Solution3 {
    public boolean isPalindrome(int x) {

        String s = "" + x;
        int len = s.length();
        char[] c = s.toCharArray();

        for (int i = 0; i <len / 2 ; i++) {
            if (c[i] != c[len -1 -i]){
                return false;
            }
        }

        return true;
    }
}