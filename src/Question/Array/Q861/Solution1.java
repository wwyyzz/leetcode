/**
 861. 翻转矩阵后的得分
 有一个二维矩阵 A 其中每个元素的值为 0 或 1 。
 移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 0 都更改为 1，将所有 1 都更改为 0。
 在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。
 返回尽可能高的分数。

 示例：
 输入：[[0,0,1,1],[1,0,1,0],[1,1,0,0]]
 输出：39
 解释：
 转换为 [[1,1,1,1],[1,0,0,1],[1,1,1,1]]
 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39

 提示：
 1 <= A.length <= 20
 1 <= A[0].length <= 20
 A[i][j] 是 0 或 1
 */

package Question.Array.Q861;

import java.util.Arrays;

/**

 */
public class Solution1 {
    public int matrixScore(int[][] A) {
        int result = 0;

        int M = A.length;
        int N = A[0].length;

        for (int i = 0; i < M; i++) {
            if (A[i][0] == 0) {
                for (int j = 0; j < N; j++) {
                    A[i][j] = 1 - A[i][j];
                }
            }

        }

        for (int i = 1; i < N; i++) {
            int countZero = 0;
            for (int[] ints : A) {
                if (ints[i] == 0) {
                    countZero++;
                }
            }

            if (countZero > (M / 2)) {
                for (int j = 0; j < M; j++) {
                    A[j][i] = 1 - A[j][i];
                }
            }
        }
        System.out.println(Arrays.deepToString(A));

        for (int[] ints : A) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < N; j++) {
                sb.append(ints[j]);
            }
            System.out.println(Integer.parseInt(sb.toString(), 2));
            result += Integer.parseInt(sb.toString(), 2);
        }

        return result;

    }
}
