package Question.Q50;

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
