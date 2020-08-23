/**
 * 263. 丑数
 * 编写一个程序判断给定的数是否为丑数。
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 *
 * 示例 1:
 * 输入: 6
 * 输出: true
 * 解释: 6 = 2 × 3
 *
 * 示例 2:
 * 输入: 8
 * 输出: true
 * 解释: 8 = 2 × 2 × 2
 *
 * 示例 3:
 * 输入: 14
 * 输出: false
 * 解释: 14 不是丑数，因为它包含了另外一个质因数 7。
 *
 * 说明：
 * 1 是丑数。
 * 2 输入不会超过 32 位有符号整数的范围: [−231,  231 − 1]。
 */
package Question.math.Q263_pass;

/**
 * 1012 / 1012 个通过测试用例
 * 状态：通过
 * 执行用时：5 ms
 *
 * 我的提交执行用时
 * 已经战胜 39.57 % 的 java 提交记录
 */
public class Solution1 {
    public boolean isUgly(int num) {
//        System.out.println("1 % 5 = " + 1 % 5);
//        System.out.println("1 % 3 = " + 1 % 3);
//        System.out.println("1 % 2 = " + 1 % 2);
        if ( num < 1 ) return false;

        while ( num % 5 == 0){
            num /= 5;
            System.out.println(num);
        }

        while ( num % 3 == 0){
            num /= 3;
            System.out.println(num);
        }

        while ( num % 2 == 0){
            num = num >> 1;
            System.out.println(num);
        }


        System.out.println(num);
        return num == 1;
    }

}
