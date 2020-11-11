/**
 542. 01 矩阵
 给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。

 两个相邻元素间的距离为 1 。

 示例 1:
 输入:

 0 0 0
 0 1 0
 0 0 0
 输出:

 0 0 0
 0 1 0
 0 0 0
 示例 2:
 输入:

 0 0 0
 0 1 0
 1 1 1
 输出:

 0 0 0
 0 1 0
 1 2 1
 注意:

 给定矩阵的元素个数不超过 10000。
 给定矩阵中至少有一个元素是 0。
 矩阵中的元素只在四个方向上相邻: 上、下、左、右。
 */

package Question.DFSAndBFS.Q542;

import java.util.ArrayList;
import java.util.Arrays;

/**

 */
public class Solution1 {
    public int[][] updateMatrix(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];

        System.out.println(Arrays.toString(result[0]));
        ArrayList<int[]> zeros = new ArrayList<>();
        ArrayList<int[]> non_zeros = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int[] pos = new int[2];
                pos[0] = i;
                pos[1] = j;
                if (matrix[i][j] == 0) {
                    zeros.add(pos);
                } else {
                    non_zeros.add(pos);
                }
            }
        }

        System.out.println(zeros);
        System.out.println(non_zeros);


        for (int[] non_zero : non_zeros) {
            int min_distance = matrix.length + matrix[0].length;
            for (int[] zero : zeros) {
                int distance = Math.abs(non_zero[0] - zero[0]) + Math.abs(non_zero[1] - zero[1]);
                if (distance < min_distance  ) {
                    min_distance = distance;
                }
            }
            result[non_zero[0]][non_zero[1]] = min_distance;

        }

        return result;
    }
}
