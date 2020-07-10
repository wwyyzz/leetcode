/**
 * 204. 计数质数
 *
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * 示例:
 *
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
package Question.Q204;

public class Solution1 {
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
        for (int i = 2; i * i <= num ; i++) {
            if ( num % i == 0) return false;
        }
        return true;
    }
}

class Solution2 {
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
        for (int i = 2; i < num ; i++) {
            if ( num % i == 0) return false;
        }
        return true;
    }
}


class Solution3 {
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
        for (int i = 2; i < num /2; i++) {
            if ( num % i == 0) return false;
        }
        return true;
    }
}

