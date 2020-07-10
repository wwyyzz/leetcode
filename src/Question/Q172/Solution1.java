/**
 * 172. 阶乘后的零
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 *
 * 示例 1:
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 * 示例 2:
 *
 * 输入: 5
 * 输出: 1
 * 解释: 5! = 120, 尾数中有 1 个零.
 * 说明: 你算法的时间复杂度应为 O(log n) 。
 */

package Question.Q172;

/**
 * 1! = 1
 * 2! = 2
 * 3! = 6
 * 4! = 24
 * 5! = 120
 * 6! = 720
 * 7! = 5040
 * 8! = 40320
 * 9! = 362880
 * 10!= 3628800
 * 11!= 39916800
 * 12!= 479001600
 * 13!= 1932053504     溢出 只能计算 < 13 的阶乘
 *
 */
public class Solution1 {
    public int trailingZeroes(int n) {
//        double result = 1;
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            System.out.println(result);
        }

        System.out.println(result);

        int zero = 0;
        while (result % 10 == 0) {
            zero++;
            result /= 10;
        }
        System.out.println(zero);
        return zero;


    }
}


/**
 * 做了些优化但是对于 n = 2147483647，用时过长，无法通过
 * 501 / 502 个通过测试用例
 * 状态：超出时间限制
 * 提交时间：17 分钟之前
 * 最后执行的输入：
 * 2147483647
 */
class Solution2 {
    public int trailingZeroes(int n) {
        int count = 0;
        for (int i = 5; i <= n ; i=i+5) {
            if (i % 25 == 0){
                int num = i;
                while ( num % 5 == 0){
                    count++;
                    num /= 5;
                }
                continue;
            }
            count++;

        }

        System.out.println(count);
        return count;
    }
}


/**
 * 继续优化，对于n /5 后的结果求和后的结果进行sum即可
 *
 * 502 / 502 个通过测试用例
 * 状态：通过
 * 执行用时：17 ms
 * 我的提交执行用时
 * 已经战胜 94.29 % 的 java 提交记录
 */
class Solution3 {
    public int trailingZeroes(int n) {
        int count = 0;
        while ( n > 0){
            count += n / 5;
            n /= 5;
        }

        System.out.println(count);
        return count;
    }


}