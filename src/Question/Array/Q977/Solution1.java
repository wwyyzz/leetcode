/**
 977. 有序数组的平方
 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。

 示例 1：
 输入：[-4,-1,0,3,10]
 输出：[0,1,9,16,100]

 示例 2：
 输入：[-7,-3,2,3,11]
 输出：[4,9,9,49,121]

 提示：
 1 <= A.length <= 10000
 -10000 <= A[i] <= 10000
 A 已按非递减顺序排序。
 */

package Question.Array.Q977;

import java.util.Arrays;

/**
 执行用时：
 2 ms, 在所有 Java 提交中击败了66.81%的用户
 内存消耗：
 40.2 MB, 在所有 Java 提交中击败了94.72%的用户
 */
public class Solution1 {
    public int[] sortedSquares(int[] A){
        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            result[i] = A[i] * A[i];
        }

        Arrays.sort(result);

        System.out.println(Arrays.toString(result));

        return result;

    }
}
