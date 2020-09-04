/**
 * 415. 字符串相加
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 *
 * 注意：
 *
 * num1 和num2 的长度都小于 5100.
 * num1 和num2 都只包含数字 0-9.
 * num1 和num2 都不包含任何前导零。
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 */
package Question.String.Q415_pass;


/**
 *
 315 / 315 个通过测试用例
 状态：通过
 执行用时：3 ms
 内存消耗：40 MB
 */
public class Solution3 {
    String addStrings(String num1, String num2) {
        int num1_len = num1.length();
        int num2_len = num2.length();

        StringBuilder sb_num1 = new StringBuilder(num1);
        sb_num1 = sb_num1.reverse();
        StringBuilder sb_num2 = new StringBuilder(num2);
        sb_num2 = sb_num2.reverse();

        if ( num1_len > num2_len) {
            for (int i = 0; i < num1_len - num2_len; i++) {
                sb_num2.append('0');
            }
        } else {
            for (int i = 0; i < num2_len - num1_len; i++) {
                sb_num1.append('0');
            }
        }

        System.out.println("array1 num1 = " + sb_num1);
        System.out.println("array2 num2 = " + sb_num2);

        StringBuilder adds = new StringBuilder();
        int carry = 0;
        int add = 0;

        for (int i = 0; i < sb_num1.length(); i++) {
            add = sb_num1.charAt(i) - '0' + sb_num2.charAt(i) - '0' + carry;

            if (add >= 10) {
                adds.append(add - 10);
                carry = 1;
            }else {
                adds.append(add);
                carry = 0;
            }

        }
        if (carry == 1){
            adds.append(1);
        }

        System.out.println(adds);

        return adds.reverse().toString();

    }
}
