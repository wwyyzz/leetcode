/**
 48. 旋转图像
 给定一个 n × n 的二维矩阵表示一个图像。

 将图像顺时针旋转 90 度。

 说明：

 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。

 示例 1:

 给定 matrix =
 [
 [1,2,3],
 [4,5,6],
 [7,8,9]
 ],

 原地旋转输入矩阵，使其变为:
 [
 [7,4,1],
 [8,5,2],
 [9,6,3]
 ]
 示例 2:

 给定 matrix =
 [
 [ 5, 1, 9,11],
 [ 2, 4, 8,10],
 [13, 3, 6, 7],
 [15,14,12,16]
 ],

 原地旋转输入矩阵，使其变为:
 [
 [15,13, 2, 5],
 [14, 3, 4, 1],
 [12, 6, 8, 9],
 [16, 7,10,11]
 ]
 */

package Question.Array.Q48_pass;

import java.util.ArrayList;
import java.util.Arrays;

/**
 21 / 21 个通过测试用例
 状态：通过
 执行用时: 1 ms
 内存消耗: 39.9 MB

 */
public class Solution1 {
    public void rotate(int[][] matrix){

        int m = matrix.length;
        int n = matrix[0].length;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= 0; j--) {
//                System.out.println(matrix[j][i]);
                list.add(matrix[j][i]);
            }
        }

        System.out.println(list);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = list.get(i * m + j );
            }

        }
        System.out.println(Arrays.toString(matrix[0]));
    }
}
