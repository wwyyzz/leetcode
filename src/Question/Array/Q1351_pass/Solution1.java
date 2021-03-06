/**
 1351. 统计有序矩阵中的负数
 给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。

 请你统计并返回 grid 中 负数 的数目。



 示例 1：

 输入：grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
 输出：8
 解释：矩阵中共有 8 个负数。
 示例 2：

 输入：grid = [[3,2],[1,0]]
 输出：0
 示例 3：

 输入：grid = [[1,-1],[-1,-1]]
 输出：3
 示例 4：

 输入：grid = [[-1]]
 输出：1


 提示：

 m == grid.length
 n == grid[i].length
 1 <= m, n <= 100
 -100 <= grid[i][j] <= 100
 */

package Question.Array.Q1351_pass;

/**
 执行用时：
 1 ms, 在所有 Java 提交中击败了45.61%的用户
 内存消耗：
 40.1 MB, 在所有 Java 提交中击败了78.44%的用户
 */
public class Solution1 {
    public int countNegatives(int[][] grid){
        int result = 0;
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;


        for (int i = 0; i < rows ; i++) {
            System.out.println(grid[i][cols - 1]);
            if ((grid[i][cols - 1]) < 0){
                for (int j = cols - 1; j >= 0; j--) {
                    if ( grid[i][j] < 0 ){
                        result++;
                    }else{
                        break;
                    }
                }
            }
        }

        return result;

    }
}
