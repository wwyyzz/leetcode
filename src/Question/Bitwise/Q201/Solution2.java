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

package Question.Bitwise.Q201;

/**
 执行用时：
 6 ms, 在所有 Java 提交中击败了99.82%的用户
 内存消耗：
 39.4 MB, 在所有 Java 提交中击败了5.28%的用户
 */
public class Solution2 {
    public int rangeBitwiseAnd(int m, int n){
        int result = m;

        int count = 0;
        while (m < n) {
            m = m >> 1;
            n = n >> 1;
            count ++;
        }

        System.out.println("m :" + m);
        System.out.println("n :" + n);

        return m << count;

    }
}
