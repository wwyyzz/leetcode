/**
 * 633. 平方数之和
 *
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
 *
 * 示例1:
 * 输入: 5
 * 输出: True
 * 解释: 1 * 1 + 2 * 2 = 5
 *
 * 示例2:
 * 输入: 3
 * 输出: False
 */
package Q633;

import java.util.Arrays;

public class Solution1 {
    public boolean judgeSquareSum(int c) {
        for (int i = 0; i * i <= c; i++) {
            for (int j = 1; j * j <= c; j++) {
//                System.out.println("i =" + i + " j =" + j);
//                System.out.println(i * i + j * j);
                if ((i * i + j * j) == c){
//                    System.out.println(i * i + j * j);
                    return true;
                }
                continue;
            }
        }
        return false;
    }
}

/**
 * c = 2147482647 超时
 */

class Solution2 {
    public boolean judgeSquareSum(int c) {
//        System.out.println(Math.sqrt(c)-0.01);

        int len = (int) Math.sqrt(c) + 1;
        if ((len - 0.0001) < 0.0001){
            return true;
        }

        int[] squares = new int[len];

        for (int i = 0; i < len; i++) {
            squares[i] = i * i;
        }

        System.out.println(Arrays.toString(squares));

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if ((squares[i] + squares[j]) == c){
                    return true;
                }
            }
        }

        return false;
    }
}