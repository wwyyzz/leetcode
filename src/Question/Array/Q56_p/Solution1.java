/**
 56. 合并区间
 给出一个区间的集合，请合并所有重叠的区间。

 示例 1:
 输入: intervals = [[1,3],[2,6],[8,10],[15,18]]
 输出: [[1,6],[8,10],[15,18]]
 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].

 示例 2:
 输入: intervals = [[1,4],[4,5]]
 输出: [[1,5]]
 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 注意：输入类型已于2019年4月15日更改。 请重置默认代码定义以获取新方法签名。
 */

package Question.Array.Q56_p;

import java.util.ArrayList;
import java.util.Arrays;

/**

 */
public class Solution1 {
    public int[][] merge(int[][] intervals){
        if (intervals.length == 0) {
            return new int[][]{};
        }

        ArrayList<int[]> list = new ArrayList<>();
        list.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            int size = list.size();
            boolean flag = false;
            for (int j = 0; j < size; j++) {
                if ((interval[0] > list.get(j)[1]) || (interval[1] < list.get(j)[0])) {
                    flag = true;
                } else {
                    int[] new_interval = new int[]
                            {Math.min(interval[0],list.get(j)[0]), Math.max(interval[1],list.get(j)[1])};
                    list.set(j,new_interval);
                    flag = false;
                }
            }

            if (flag) {
                list.add(interval);
            }

        }


        int[][] result = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        System.out.println("result   :" + Arrays.toString(result[0]));
        System.out.println("result   :" + Arrays.toString(result[1]));
        System.out.println("result   :" + Arrays.toString(result[2]));
        return result;

    }
}
