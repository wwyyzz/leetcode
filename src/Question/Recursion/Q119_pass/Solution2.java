/**
 119. 杨辉三角 II
 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。

 在杨辉三角中，每个数是它左上方和右上方的数的和。
 示例:

 输入: 3
 输出: [1,3,3,1]
 进阶：
 你可以优化你的算法到 O(k) 空间复杂度吗？
 */

package Question.Recursion.Q119_pass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 使用队列重新优化，比Solution1 更清晰
 执行用时：
 1 ms, 在所有 Java 提交中击败了83.10%的用户
 内存消耗：
 36.3 MB, 在所有 Java 提交中击败了73.39%的用户
 */
public class Solution2 {
    public List<Integer> getRow(int rowIndex){
        List<Integer> result = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        if (rowIndex == 0) {
            return list;
        }
        list.add(1);

        int level = 2;
        while (level <= rowIndex) {
            list.add(0);
            int size = list.size();
            int s = 0;
            for (int i = 1; i <= size ; i++) {
                int t = list.poll();
                int u = s + t;
                list.add(u);
                s = t;
            }

            level++;
        }

         System.out.println(list);

        return list;

    }
}
