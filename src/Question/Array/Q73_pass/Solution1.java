/**
 73. 矩阵置零
 给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。

 示例 1:

 输入:
 [
 [1,1,1],
 [1,0,1],
 [1,1,1]
 ]
 输出:
 [
 [1,0,1],
 [0,0,0],
 [1,0,1]
 ]
 示例 2:

 输入:
 [
 [0,1,2,0],
 [3,4,5,2],
 [1,3,1,5]
 ]
 输出:
 [
 [0,0,0,0],
 [0,4,5,0],
 [0,3,1,0]
 ]
 进阶:

 一个直接的解决方案是使用  O(mn) 的额外空间，但这并不是一个好的解决方案。
 一个简单的改进方案是使用 O(m + n) 的额外空间，但这仍然不是最好的解决方案。
 你能想出一个常数空间的解决方案吗？
 */

package Question.Array.Q73_pass;

import java.util.HashSet;

/**
 执行用时：
 3 ms, 在所有 Java 提交中击败了23.21%的用户内存消耗：
 41.4 MB, 在所有 Java 提交中击败了24.15%的用户
 */
public class Solution1 {
    public void setZeroes(int[][] matrix) {
        HashSet row_set = new HashSet();
        HashSet col_set = new HashSet();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row_set.add(i);
                    col_set.add(j);
                }

            }
        }

        System.out.println("row_set   :" + row_set);
        System.out.println("col_set   :" + col_set);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                if ( row_set.contains(i) || col_set.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println(matrix);

    }
}
