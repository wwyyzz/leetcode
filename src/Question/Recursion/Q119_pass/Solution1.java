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
import java.util.Arrays;
import java.util.List;

/**
 执行用时：
 2 ms, 在所有 Java 提交中击败了49.43%的用户
 内存消耗：
 36.2 MB, 在所有 Java 提交中击败了76.27%的用户
 */
public class Solution1 {
    public List<Integer> getRow(int rowIndex){
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        lists.add(list);

        if (rowIndex == 0) {
            return list;
        }

        list = new ArrayList<>();
        for (int i = 0; i < 2 ; i++) {
            list.add(1);
        }
        lists.add(list);
        if (rowIndex == 1) {
            return list;
        }

        int level = 2;
        while (level <= rowIndex + 1) {
            List<Integer> lastLevel = lists.get(lists.size() - 1);
            Integer[] currLevel = new Integer[level];
            currLevel[0] = 1;
            currLevel[level-1] = 1;

            for (int i = 1; i < (currLevel.length - 1); i++) {
                currLevel[i] = lastLevel.get(i - 1) + lastLevel.get(i);
            }
            lists.add(Arrays.asList(currLevel));
            level++;
        }

        // System.out.println(lists);

        return lists.get(lists.size() - 1);

    }
}
