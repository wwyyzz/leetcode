/**
 118. 杨辉三角
 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。

 在杨辉三角中，每个数是它左上方和右上方的数的和。

 示例:

 输入: 5
 输出:
 [
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
 ]
 */

package Question.Recursion.Q118_pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 36.6 MB, 在所有 Java 提交中击败了19.43%的用户
 */
public class Solution1 {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0) {
            return result;
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        result.add(list);

        if (numRows == 1) {
            return result;
        }

        list = new ArrayList<>();
        for (int i = 0; i < 2 ; i++) {
            list.add(1);
        }
        result.add(list);

        if (numRows == 2) {
            return result;
        }

        int level = 3;
        while (level <= numRows) {
            List<Integer> lastLevel = result.get(result.size() - 1);
            Integer[] currLevel = new Integer[level];
            currLevel[0] = 1;
            currLevel[level-1] = 1;

            for (int i = 1; i < (currLevel.length - 1); i++) {
                currLevel[i] = lastLevel.get(i - 1) + lastLevel.get(i);
            }
            result.add(Arrays.asList(currLevel));
            level++;
        }

        System.out.println(result);

        return result;
    }
}
