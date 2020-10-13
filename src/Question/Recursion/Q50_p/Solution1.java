/**
 50. Pow(x, n)
 实现 pow(x, n) ，即计算 x 的 n 次幂函数。

 示例 1:
 输入: 2.00000, 10
 输出: 1024.00000

 示例 2:
 输入: 2.10000, 3
 输出: 9.26100

 示例 3:
 输入: 2.00000, -2
 输出: 0.25000
 解释: 2-2 = 1/22 = 1/4 = 0.25

 说明:
 -100.0 < x < 100.0
 n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。
 */

package Question.Recursion.Q50_p;

import java.util.HashMap;

/**
 执行出错信息：
 Line 8: java.lang.StackOverflowError
 最后执行的输入：
 0.00001
 2147483647

 */
public class Solution1 {
    HashMap<Integer,Double> map = new HashMap<>();
    public double myPow(double x, int n){
        if (n < 0) {
            return  1.0 / myPow(x, -n);
        }

        if (map.containsKey(n)) {
            return map.get(n);
        }

        double result = 0;
        if (n == 1) {
            result = x;
        } else {
            result = x * myPow(x, n - 1);
        }

        map.put(n, result);
        return result;

    }
}
