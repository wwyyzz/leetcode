/**
 200. 岛屿数量
 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。

 岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。

 此外，你可以假设该网格的四条边均被水包围。

 示例 1:
 输入:
 [
 ['1','1','1','1','0'],
 ['1','1','0','1','0'],
 ['1','1','0','0','0'],
 ['0','0','0','0','0']
 ]
 输出: 1

 示例 2:
 输入:
 [
 ['1','1','0','0','0'],
 ['1','1','0','0','0'],
 ['0','0','1','0','0'],
 ['0','0','0','1','1']
 ]
 输出: 3
 解释: 每座岛屿只能由水平和/或竖直方向上相邻的陆地连接而成。
 */

package Question.DFSAndBFS.Q200_pass;

/**
 执行用时：
 2 ms, 在所有 Java 提交中击败了97.61%的用户
 内存消耗：
 41.5 MB, 在所有 Java 提交中击败了23.59%的用户
 */
public class Solution1 {
    public int numIslands(char[][] grid){
        int result = 0;

        int col = grid.length;
        int row = grid[0].length;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (grid[i][j] == '1') {
                    result++;
                    dfs(grid,i , j);

                }
            }
        }

        return result;

    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i , j + 1);
        dfs(grid, i , j - 1);

    }
}
