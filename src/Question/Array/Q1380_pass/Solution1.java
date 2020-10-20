/**
 1380. 矩阵中的幸运数
 给你一个 m * n 的矩阵，矩阵中的数字 各不相同 。请你按 任意 顺序返回矩阵中的所有幸运数。

 幸运数是指矩阵中满足同时下列两个条件的元素：
 在同一行的所有元素中最小
 在同一列的所有元素中最大

 示例 1：
 输入：matrix = [[3,7,8],[9,11,13],[15,16,17]]
 输出：[15]
 解释：15 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。

 示例 2：
 输入：matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
 输出：[12]
 解释：12 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。

 示例 3：
 输入：matrix = [[7,8],[1,2]]
 输出：[7]

 提示：
 m == mat.length
 n == mat[i].length
 1 <= n, m <= 50
 1 <= matrix[i][j] <= 10^5
 矩阵中的所有元素都是不同的
 */

package Question.Array.Q1380_pass;

import java.util.ArrayList;
import java.util.List;

/**
 执行用时：
 4 ms, 在所有 Java 提交中击败了26.24%的用户
 内存消耗：
 38.7 MB, 在所有 Java 提交中击败了100.00%的用户
 */
public class Solution1 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        List<Integer> row_mins = new ArrayList<>();
        List<Integer> col_maxs = new ArrayList<>();

        int M = matrix.length;
        int N = matrix[0].length;

        for (int i = 0; i < M; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < N; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            row_mins.add(min);
        }

        for (int i = 0; i < N; i++) {
            int max = matrix[0][i];
            for (int j = 0; j < M; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
            col_maxs.add(max);
        }

        System.out.println(row_mins);
        System.out.println(col_maxs);
        for (Integer row_min : row_mins) {
            for (Integer col_max : col_maxs) {
                if (row_min.equals(col_max)) {
                    result.add(row_min);
                }
            }
        }

        System.out.println(result);
        return result;

    }
}
