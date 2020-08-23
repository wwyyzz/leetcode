/**
 * 231. 2的幂
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 *
 * 示例 1:
 * 输入: 1
 * 输出: true
 * 解释: 20 = 1
 * 示例 2:
 *
 * 输入: 16
 * 输出: true
 * 解释: 24 = 16
 * 示例 3:
 *
 * 输入: 218
 * 输出: false
 *
 *
 */
package Question.bitwise.Q231_pass;

/**
 * 一直除以2，直到最后，判断是否==1
 *
 * 1108 / 1108 个通过测试用例
 * 状态：通过
 * 执行用时：13 ms
 *
 * 我的提交执行用时
 * 已经战胜 2.01 % 的 java 提交记录
 */

public class Solution1 {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if ( n == 0 || n % 2 != 0) return false;

        while (n % 2 == 0){
            n /= 2;
        }

        System.out.println(n);
        return n == 1;
    }
}

/**
 * 继续优化，n & (n-1) == 0 即可判断
 *
 * 1108 / 1108 个通过测试用例
 *  状态：通过
 *  执行用时：4 ms
 *
 *  我的提交执行用时
 *  已经战胜 59.71 % 的 java 提交记录
 *
 */
class Solution2 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        return (n & (n-1))==0;
    }
}