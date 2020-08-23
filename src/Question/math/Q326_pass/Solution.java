/**
 *326. 3的幂
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 27
 * 输出: true
 * 示例 2:
 *
 * 输入: 0
 * 输出: false
 * 示例 3:
 *
 * 输入: 9
 * 输出: true
 * 示例 4:
 *
 * 输入: 45
 * 输出: false
 */
package Question.math.Q326_pass;

import java.util.Arrays;
import java.util.List;

/**
 * 21038 / 21038 个通过测试用例
 * 状态：通过
 * 执行用时：15 ms
 *
 * 我的提交执行用时
 * 已经战胜 99.28 % 的 java 提交记录
 */
public class Solution {
    public boolean isPowerOfThree(int n) {

        if (n == 0 || n % 2 == 0) return false;
        while ( n % 3 == 0){
            n /= 3;
        }
        System.out.println(n);
        return n==1;
    }
}


/**
 * 21038 / 21038 个通过测试用例
 * 状态：通过
 * 执行用时：15 ms
 *
 * 我的提交执行用时
 * 已经战胜 99.28 % 的 java 提交记录
 *
 */
class Solution2 {
    public boolean isPowerOfThree(int n) {
        //1162261467 是 < Integer.MAXVALUE 的最大的3的幂,其他的都可以被他整除
        return (n > 0) && ((1162261467 % n) == 0) ;
    }
}

/**
 * 1
 * 3
 * 9
 * 27
 * 81
 * 243
 * 729
 * 2187
 * 6561
 * 19683
 * 59049
 * 177147
 * 531441
 * 1594323
 * 4782969
 * 14348907
 * 43046721
 * 129140163
 * 387420489
 * 1162261467
 */

class Solution3 {
    public boolean isPowerOfThree(int n) {
        List<Integer> list = Arrays.asList(1,3,9,27,81,243,729,2187,6561,19683,59049,
                177147,531441,1594323,4782969,14348907,43046721,129140163,387420489,1162261467);

        return list.contains(n);

    }
}