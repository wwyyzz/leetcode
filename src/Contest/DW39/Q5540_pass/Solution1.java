/**
 5540. 两点之间不包含任何点的最宽垂直面积 显示英文描述
 给你 n 个二维平面上的点 points ，其中 points[i] = [xi, yi] ，请你返回两点之间内部不包含任何点的 最宽垂直面积 的宽度。
 垂直面积 的定义是固定宽度，而 y 轴上无限延伸的一块区域（也就是高度为无穷大）。 最宽垂直面积 为宽度最大的一个垂直面积。
 请注意，垂直区域 边上 的点 不在 区域内。

 示例 1：
 输入：points = [[8,7],[9,9],[7,4],[9,7]]
 输出：1
 解释：红色区域和蓝色区域都是最优区域。

 示例 2：
 输入：points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
 输出：3

 提示：
 n == points.length
 2 <= n <= 105
 points[i].length == 2
 0 <= xi, yi <= 109
 */

package Contest.DW39.Q5540_pass;

import java.util.Arrays;

/**
 52 / 52 个通过测试用例
 状态：通过
 执行用时: 14 ms
 内存消耗: 66.7 MB

 */
public class Solution1 {
    public int maxWidthOfVerticalArea(int[][] points){
        int[] X = new int[points.length];

        for (int i = 0; i < points.length; i++) {
            X[i] = points[i][0];
        }

        Arrays.sort(X);

        int[] step = new int[points.length - 1];

        int max = 0;
        for (int i = 1; i < points.length; i++) {
            if (X[i] - X[i - 1] > max) {
                max = X[i] - X[i - 1];
            }
        }

        return max;

    }
}
