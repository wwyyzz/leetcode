/**
 357. 计算各个位数不同的数字个数
 给定一个非负整数 n，计算各位数字都不同的数字 x 的个数，其中 0 ≤ x < 10n 。

 示例:
 输入: 2
 输出: 91
 解释: 答案应为除去 11,22,33,44,55,66,77,88,99 外，在 [0,100) 区间内的所有数字。
 */

package Question.Q357_p;

/**

 */
public class Solution1 {
    public int countNumbersWithUniqueDigits(int n){
        int result = 0;

        for (int i = 0; i < Math.pow(10, n); i++) {
            String s = Integer.toString(i);
            if (!isRepeat(s)) {
                result++;
            }

        }
        System.out.println(result);
        return result;

    }

    private boolean isRepeat(String s) {
        int len = s.length();
        for (int j = 0; j < len; j++) {
            if (s.lastIndexOf(s.charAt(j)) != j) {
                return true;
            }
        }
        return false;
    }
}
