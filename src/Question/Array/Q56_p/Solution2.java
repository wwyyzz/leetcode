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
public class Solution2 {
    public int[][] merge(int[][] intervals){
        if (intervals.length == 0) {
            return new int[][]{};
        }

        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);

        ArrayList<int[]> lists = new ArrayList<>();

        int L = intervals[0][0];
        int R = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] > R || intervals[i][1] < L) {
                lists.add(new int[]{L, R});
                L = intervals[i][0];
                R = intervals[i][1];
            } else {
                if (intervals[i][0] < L) {
                    L = intervals[i][0];
                }
                if (intervals[i][1] > R) {
                    R = intervals[i][1];
                }
            }
        }
        lists.add(new int[]{L, R});

        int[][] result = new int[lists.size()][2];

        System.out.println(lists);
        return lists.toArray(result);

    }
}
