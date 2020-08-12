/**
 233. 数字 1 的个数
 给定一个整数 n，计算所有小于等于 n 的非负整数中数字 1 出现的个数。

 示例:

 输入: 13
 输出: 6 
 解释: 数字 1 出现在以下数字中: 1, 10, 11, 12, 13 。
 */

package Question.Q233;

/**

 */
public class Solution1 {
    public int countDigitOne(int n){
        int result = 0;


        int remainder = 0;
        for (int i = 1; i <= n ; i++) {

            int temp = i ;
            while (temp> 0) {
                remainder = temp% 10;
                if (remainder == 1) {
                    result++;
                }
                
                temp /= 10;
            }
        }

        System.out.println(result);
        return result;

    }
}
