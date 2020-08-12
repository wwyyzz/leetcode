/**
 66. 加一
 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

 你可以假设除了整数 0 之外，这个整数不会以零开头。

 示例 1:

 输入: [1,2,3]
 输出: [1,2,4]
 解释: 输入数组表示数字 123。
 示例 2:

 输入: [4,3,2,1]
 输出: [4,3,2,2]
 解释: 输入数组表示数字 4321。
 */

package Question.Q66_p;

import java.util.Arrays;

/**

 */
public class Solution2 {
    public int[] plusOne(int[] digits) {

        int[] result = new int[digits.length];

        int carry = 0;
        int num;
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i > 0 ; i--) {
            num = digits[i] + carry  ;
            if (num == 10) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] = num;
                return digits;
            }
        }

        if (digits[0] == 9 && carry == 1) {
            int[] result2 = new int[digits.length + 1];
            result2[0] = 1;
            return result2;
        } else if (carry == 1){
            digits[0]++;
        }


        System.out.println(Arrays.toString(digits));

        return digits;

    }
}
