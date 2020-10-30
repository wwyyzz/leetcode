/**
 463. 岛屿的周长
 给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。

 网格中的格子水平和垂直方向相连（对角线方向不相连）。
 整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。

 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。
 格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。

 示例 :

 输入:
 [[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

 输出: 16

 解释: 它的周长是下面图片中的 16 个黄色的边：


 */

package Question.Array.Q463_pass;

/**
 执行用时：
 8 ms, 在所有 Java 提交中击败了75.57%的用户
 内存消耗：
 39.9 MB, 在所有 Java 提交中击败了28.92%的用户
 */
public class Solution1 {
    public int islandPerimeter(int[][] grid) {

        int lands = 0;
        int edges = 0;

        int M = grid.length;
        int N = grid[0].length;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 1) {
                    lands++;
                    edges += getEdges(grid, i, j, M, N);
                }
            }
        }

        System.out.println("lands   =" + lands);
        System.out.println("edges   =" + edges);

        return lands * 4 - edges;

    }

    private int getEdges(int[][] grid, int i, int j, int M, int N) {
        int edge = 0;

        if ((i + 1 < M && grid[i + 1][j] == 1)) {
            edge++;
        }
        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
            edge++;
        }
        if (j + 1 < N && grid[i][j + 1] == 1) {
            edge++;
        }
        if (j - 1 >= 0 && grid[i][ j - 1] == 1) {
            edge++;
        }

        return edge;
    }
}
