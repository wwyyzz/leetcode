package Offer.Offer16;

/**
 * 291 / 304 个通过测试用例
 * 状态：超出时间限制
 * 最后执行的输入：
 * 0.00001
 * 2147483647
 */
public class Solution1 {
    public double myPow(double x, int n) {
        double result = 1.0;
        for (int i = 1; i <= Math.abs(n); i++) {
            result *= x;
        }
        System.out.println(result);
        return n>=0?(result):(1.0/result);
    }
}
