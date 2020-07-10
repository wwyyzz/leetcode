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
package Question.Q633;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

        for (int i = 1; i < len; i++) {
            squares[i] = i * i;
        }

        System.out.println(Arrays.toString(squares));
        System.out.println("size = "+ squares.length);

        for (int i = 0; i < len; i++) {
            if (squares[i] > c){
                break;
            }
            for (int j = 0; j < len; j++) {
                if (squares[j] > c){
                    break;
                }
                if ((squares[i] + squares[j]) == c){
                    return true;
                }
            }
        }

        return false;
    }
}

/**
 *
 124 / 124 个通过测试用例
 状态：通过
 执行用时：138 ms
 我的提交执行用时
 已经战胜 1.58 % 的 java 提交记录
 */
class Solution3 {
    public boolean judgeSquareSum(int c) {

        int len = (int) Math.sqrt(c);
//        if ((len - 0.0001) < 0.0001){
//            return true;
//        }
        // System.out.println("len = " + len);
        Set<Integer> squares = new HashSet<>();

        for (int i = 0; i <= len; i++) {
            squares.add( i * i);
            if (squares.contains( c - i * i)) {
                return true;
            }
        }

        return false;
    }
}


/**
 * 执行用时：13 ms
 * 已经战胜 76.84 % 的 java 提交记录
 */
class Solution4 {
    public boolean judgeSquareSum(int c) {

    int i = 0;
    int j = (int)Math.sqrt(c);

    while (i <=j){
        int num = i * i + j * j;
        if (num == c) {
            return true;
        }
        else if (num < c){
            i++;
        }else {
            j--;
        }

    }

    return false;
    }
}