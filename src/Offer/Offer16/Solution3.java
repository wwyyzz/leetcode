package Offer.Offer16;

/**

 */
public class Solution3 {
    public double myPow(double x, int n) {
        double result = 1.0;
        double abs_x = Math.abs(x);
        int pow = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                result *= abs_x;
            }
            abs_x *= abs_x;
            n /= 2;
        }

        System.out.println(result);
        return n>=0?(result):(1.0/result);
    }
}
