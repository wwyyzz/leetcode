/**
 * 479. 最大回文数乘积
 * 你需要找到由两个 n 位数的乘积组成的最大回文数。
 *
 * 由于结果会很大，你只需返回最大回文数 mod 1337得到的结果。
 *
 * 示例:
 * 输入: 2
 * 输出: 987
 * 解释: 99 x 91 = 9009, 9009 % 1337 = 987
 *
 * 说明:
 * n 的取值范围为 [1,8]。
 */

package Q479;

import java.math.BigInteger;

public class Solution1 {
    public int largestPalindrome(int n) {
        int start = (int)Math.pow(10, n) - 1;
        System.out.println("start =" + start);
        for (int i = start; i > 0 ; i--) {
            for (int j = i; j > 0 ; j--) {
                BigInteger num = BigInteger.valueOf(i).multiply(BigInteger.valueOf(j));
//                System.out.println("num = " + num);
                if (loopNumber(num)){
                    System.out.println("num = " + num);
                    return num.mod(BigInteger.valueOf(1337)).intValue();
                }
            }
        }

        return 1;
    }

    private boolean loopNumber(BigInteger n){
        System.out.println(n.toString());
        String str_a = new String(n.toString());

        StringBuilder sb = new StringBuilder(n.toString());
        String str_b = new String(sb.reverse().toString());
        System.out.println("str_a =" + str_a);
        System.out.println("str_b =" + str_b);
        System.out.println(str_a.equals(str_b));
        return str_a.equals(str_b);
    }
}
