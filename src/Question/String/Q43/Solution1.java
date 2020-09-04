/**
 43. 字符串相乘
 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。

 示例 1:

 输入: num1 = "2", num2 = "3"
 输出: "6"
 示例 2:

 输入: num1 = "123", num2 = "456"
 输出: "56088"
 说明：

 num1 和 num2 的长度小于110。
 num1 和 num2 只包含数字 0-9。
 num1 和 num2 均不以零开头，除非是数字 0 本身。
 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。
 */

package Question.String.Q43;

/**

 */
public class Solution1 {
    public String multiply(String num1, String num2) {
        String result = new String();

        long sum = 0;
        for (int i = 0; i < num2.length(); i++) {

            int carry = 0;
            for (int j = num1.length() - 1; j >= 0 ; j--){
                int multi = (num2.charAt(i) - '0') * (num1.charAt(j) - '0') + carry;
                int remained = multi % 10;
                carry = multi / 10;

            }
        }



        return result;

    }
}
