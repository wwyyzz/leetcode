/**
 498. 对角线遍历
 给定一个含有 M x N 个元素的矩阵（M 行，N 列），请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。

 示例:
 输入:
 [
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
 ]
 输出:  [1,2,4,7,5,3,6,8,9]

 解释:

 说明:
 给定矩阵中的元素总数不会超过 100000 。
 */

package Question.Array.Q498;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**

 */
public class Solution1 {
    public int[] findDiagonalOrder(int[][] matrix){
        if (matrix.length == 0 || matrix.length == 1) {
            return matrix[0];
        }

        int[] result = new int[matrix.length * matrix[0].length];

        int M = matrix.length;
        int N = matrix[0].length;
        ArrayList<LinkedList<int[]>> poses = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            LinkedList<int[]> list = new LinkedList<>();
            list.add(new int[]{0, i});
            poses.add(list);
        }

        for (int i = 1; i < N ; i++) {
            LinkedList<int[]> list = new LinkedList<>();
            list.add(new int[]{i, N - 1});
            poses.add(list);
        }


        for (int i = 0; i < poses.size(); i++) {
            LinkedList<int[]> pose = poses.get(i);
            int[] head = pose.get(0);

            if (i % 2 == 0) {
                for (int j = 0; j < (head[1] - head[0]); j++) {
                    pose.addFirst(new int[]{head[0] + j + 1, head[1] - j - 1});
                }
            }else{
                for (int j = 0; j < (head[1] - head[0]); j++) {
                    pose.add(new int[]{head[0] + 1, head[1] - 1});
                }
            }
        }

        int i = 0;
        for (LinkedList<int[]> pose : poses) {
            for (int[] ints : pose) {
                result[i] = matrix[ints[0]][ints[1]];
                i++;
            }
        }


        System.out.println(Arrays.toString(result));


        return result;

    }
}
