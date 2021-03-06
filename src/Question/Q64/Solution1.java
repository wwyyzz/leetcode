/**
 64. 最小路径和
 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。

 说明：每次只能向下或者向右移动一步。

 示例:

 输入:
 [
 [1,3,1],
 [1,5,1],
 [4,2,1]
 ]
 输出: 7
 解释: 因为路径 1→3→1→1→1 的总和最小。
 */

package Question.Q64;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**

 */
public class Solution1 {
    public int minPathSum(int[][] grid){
        int result = 0;

        int level = 1;

        ArrayList<ArrayList<int[]>> all_paths = new ArrayList<>();
        ArrayList<int[]> path = new ArrayList<>();

        LinkedList<ArrayList<int[]>> queue = new LinkedList<>();

        int[] pos = {0,0};
        path.add(pos);
//        all_paths.add(path);
        queue.offer(path);

        System.out.println(all_paths);

        while (level < grid.length){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                ArrayList<int[]> list = queue.poll();
//                String s = list.toString();
                for (int[] ints : list) {
                    System.out.println(Arrays.toString(ints));
                }
//                System.out.println(Arrays.toString(new ArrayList[]{list}));

            }

            level++;
        }


        return result;

    }
}
