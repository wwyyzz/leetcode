package Question.string.Q537;

/**
 * @program: leetcode
 * @description: Question.string.Q537
 * @author: Jun Wang
 * @create: 2018-12-10 15:41
 */

import java.util.Arrays;

/**
 * 537. 复数乘法
 * 给定两个表示复数的字符串。
 * 返回表示它们乘积的字符串。注意，根据定义 i2 = -1 。
 *
 * 示例 1:
 * 输入: "1+1i", "1+1i"
 * 输出: "0+2i"
 * 解释: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i ，你需要将它转换为 0+2i 的形式。
 *
 * 示例 2:
 * 输入: "1+-1i", "1+-1i"
 * 输出: "0+-2i"
 * 解释: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i ，你需要将它转换为 0+-2i 的形式。
 *
 * 注意:
 * 输入字符串不包含额外的空格。
 * 输入字符串将以 a+bi 的形式给出，其中整数 a 和 b 的范围均在 [-100, 100] 之间。输出也应当符合这种形式。
 *
 */

/**
 * 55 / 55 个通过测试用例
 * 状态：通过
 * 执行用时：5 ms
 *
 * 已经战胜 89.64 % 的 java 提交记录
 */
public class Solution1 {
    public String complexNumberMultiply(String a, String b) {
//        分别提取String a和b的实部和虚部，转为int保存在数组中arr_a arr_b
        int[] numA = getParts(a);
        int[] numB = getParts(b);

//        针对数组中的值，来计算乘法的结果
//        实部：arr_a[0]*arr_b[0] - arr_a[1]*arr_b[1]
        int realPart = numA[0] * numB[0] - numA[1] * numB[1];
        int imaginaryPart = numA[0] * numB[1] + numA[1] * numB[0];
//        虚部：arr_a[0]*arr_b[1] + arr_a[1]*arr_b[0]
//
//
//        将计算的结果，组装成a+bi的 String形式返回
        return realPart + "+" + imaginaryPart + "i";
    }

    private int[] getParts(String s){
        int pos = s.indexOf('+');
        String s1 = s.substring(0,pos);
        String s2 = s.substring(pos+1, s.length()-1);

        int[] parts = {Integer.valueOf(s1), Integer.valueOf(s2)};

        System.out.println(Arrays.toString(parts));

        return parts;
    }
}
