/**
 * 7. 整数反转
 * 题目描述提示帮助提交记录社区讨论阅读解答
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2次方31,  2次方31 − 1]。
 * 请根据这个假设，如果反转后整数溢出那么就返回 0。
 */

package Q7;

public class Solution1 {
}

class s1{
    public int reverse(int x) {
        int result = 0;
        String s = "" + x;
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();

        System.out.println(sb.charAt(sb.length() - 1));

        if (sb.charAt(sb.length() - 1) == '-'){
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb);
            try {
                result = -Integer.parseInt(sb.toString());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return 0;
            }
        }else {
            try {
                result = -Integer.parseInt(sb.toString());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return 0;
            }
        }
        return 0;
    }
}