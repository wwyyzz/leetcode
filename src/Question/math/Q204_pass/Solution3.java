package Question.math.Q204_pass;

/**
 *
 20 / 20 个通过测试用例
 状态：通过
 执行用时：693 ms
 内存消耗：36.7 MB
 */
public class Solution3 {
    public int countPrimes(int n) {
        if (n == 0 || n == 1 || n == 2){
            return 0;
        }

        int result = 1;
        for (int i = 3; i < n; i=i+2) {
            if (isPrime(i)){
                result++;
            }
        }
        System.out.println(result);
        return result;
    }

    private boolean isPrime(int num){
//        if (n <= 1) return false;
        if (num % 5 == 0 && num != 5) return false;
        for (int i = 2; i*i < num ; i++) {
            if ( num % i == 0) return false;
        }
        return true;
    }
}
