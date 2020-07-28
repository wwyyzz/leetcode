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

package Question.Q66;

import java.util.Arrays;

/**

 */
public class Solution1 {
    public int[] plusOne(int[] digits) {

        int num = 0;
        for (int i = 0; i < digits.length; i++) {
            num += digits[i] * Math.pow(10, digits.length - i - 1);
        }

        System.out.println(num);

        char[] chars = Integer.toString(num + 1).toCharArray();

        int[] result = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = chars[i] - 48;
        }

        System.out.println(Arrays.toString(result));

        return result;

    }
}
