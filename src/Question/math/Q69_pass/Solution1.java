/**
 * 69. x 的平方根
 * 实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * 示例 1:
 * 输入: 4
 * 输出: 2
 * 示例 2:
 *
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 *      由于返回类型是整数，小数部分将被舍去。
 */
package Question.math.Q69_pass;

/**
 *调用库函数，耍无赖
 *
 1017 / 1017 个通过测试用例
 状态：通过
 执行用时：19 ms

 我的提交执行用时
 已经战胜 99.94 % 的 java 提交记录
 */
public class Solution1 {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
}

/**
 * 二分法，int最大开根号也就46340.9，从0~46340之间找到n，n的平方小于x，n+1的平方大于x，就好
 *
 * 1017 / 1017 个通过测试用例
 * 状态：通过
 * 执行用时：35 ms
 *
 * 我的提交执行用时
 * 已经战胜 74.84 % 的 java 提交记录
 */
class Solution2 {
    public int mySqrt(int x) {
        if ( x >= 2147395600){
            return 46340;
        }
        for (int i = 0; i <=46340 ; i++) {
            System.out.println("i * i=" + i*i);
            System.out.println("i +1 * i+1=" + (i+1)*(i+1));
            if ((i*i <= x) && ((i+1)*(i+1) > x) ){
                System.out.println("i am " + i);
                return i;
            }
        }
        return 0;
    }
}
