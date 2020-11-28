package Offer.Offer16;

/**

 */
public class Solution2 {
    public double myPow(double x, int n) {
        double result = 1.0;
        long long_n = n;
        double abs_x = Math.abs(x);
        while (long_n > 0) {
            if (long_n % 2 == 0) {
                double tmp = myPow(abs_x, (int)(long_n / 2));
                result = tmp * tmp;
            } else {
                double tmp = myPow(abs_x, (int)((long_n - 1) / 2));
                result = tmp * tmp * abs_x;
            }
            long_n /= 2.0;
        }

        System.out.println(result);
        return n>=0?(result):(1.0/result);
    }
}
