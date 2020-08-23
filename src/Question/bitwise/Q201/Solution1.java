/**
 201. 数字范围按位与
 给定范围 [m, n]，其中 0 <= m <= n <= 2147483647，返回此范围内所有数字的按位与（包含 m, n 两端点）。

 示例 1:

 输入: [5,7]
 输出: 4
 示例 2:

 输入: [0,1]
 输出: 0
 */

package Question.bitwise.Q201;

/**
 8256 / 8266 个通过测试用例
 状态：超出时间限制
 提交时间：2 分钟之前
 最后执行的输入：
 0
 2147483647
 */
public class Solution1 {
    public int rangeBitwiseAnd(int m, int n){
        int result = m;
        for (int i = m + 1; i <=n ; i++) {
            result = i & result ;
        }

        System.out.println(result);

        return result;

    }
}
