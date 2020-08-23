/**
 //给你一个大小为 m * n 的方阵 mat，方阵由若干军人和平民组成，分别用 1 和 0 表示。
 //
 // 请你返回方阵中战斗力最弱的 k 行的索引，按从最弱到最强排序。
 //
 // 如果第 i 行的军人数量少于第 j 行，或者两行军人数量相同但 i 小于 j，那么我们认为第 i 行的战斗力比第 j 行弱。
 //
 // 军人 总是 排在一行中的靠前位置，也就是说 1 总是出现在 0 之前。
 //
 //
 //
 // 示例 1：
 //
 // 输入：mat =
 //[[1,1,0,0,0],
 // [1,1,1,1,0],
 // [1,0,0,0,0],
 // [1,1,0,0,0],
 // [1,1,1,1,1]],
 //k = 3
 //输出：[2,0,3]
 //解释：
 //每行中的军人数目：
 //行 0 -> 2
 //行 1 -> 4
 //行 2 -> 1
 //行 3 -> 2
 //行 4 -> 5
 //从最弱到最强对这些行排序后得到 [2,0,3,1,4]
 //
 //
 // 示例 2：
 //
 // 输入：mat =
 //[[1,0,0,0],
 // [1,1,1,1],
 // [1,0,0,0],
 // [1,0,0,0]],
 //k = 2
 //输出：[0,2]
 //解释：
 //每行中的军人数目：
 //行 0 -> 1
 //行 1 -> 4
 //行 2 -> 1
 //行 3 -> 1
 //从最弱到最强对这些行排序后得到 [0,2,3,1]
 //
 //
 //
 //
 // 提示：
 //
 //
 // m == mat.length
 // n == mat[i].length
 // 2 <= n, m <= 100
 // 1 <= k <= m
 // matrix[i][j] 不是 0 就是 1
 //
 // Related Topics 数组 二分查找
 // 👍 29 👎 0
 */

package Question.array.Q1337_pass;

import java.util.*;

/**

 52 / 52 个通过测试用例
 状态：通过
 执行用时：7 ms
 内存消耗：40.5 MB
 */
public class Solution1 {
    public int[] kWeakestRows(int[][] mat, int k){
        int[] result =new int[k];

        TreeMap map = new TreeMap();
        for (int i = 0; i < mat.length; i++) {
            int count = 0 ;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] > 0) {
                    count++;
                } else {
                    break;
                }
            }

            map.put(i,count);

        }

        System.out.println(map);

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        System.out.println(list);

        //lambda
        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

//        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });


        System.out.println(list);
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        System.out.println(Arrays.toString(result));
        return result;

    }
}
