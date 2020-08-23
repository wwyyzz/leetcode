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
package Question.string.Q415_pass;

import java.util.Arrays;

public class Solution1 {
    String addStrings(String num1, String num2) {
        String temp = "";


        if (num1.length() < num2.length()){
            String s = num1;
            num1 = num2;
            num2 = s;
        }

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        int len_a = num1.length();
        int len_b = num2.length();

        char[] arr22 = new char[len_a];
        Arrays.fill(arr22,(char)(48));
        System.out.println((char)(48));
        System.out.println(arr22);

        System.arraycopy(arr2, 0, arr22, len_a - len_b, len_b);

        System.out.println(arr1);
        System.out.println(arr22);

        char[] arr3 = new char[len_a];
        for (int i = len_a - 1; i <= 0; i--) {
            arr3[i] = (char)(arr3[i] + arr1[i] + arr2[i] - 48 );
            if (arr3[i] > 57) {
                arr3[i] -= 10;
                arr3[i-1] += 1;
            }
        }

//
        String s = new String(arr3);
        System.out.println(s);
        return s;
    }
}
