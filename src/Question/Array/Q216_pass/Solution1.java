/**
 216. 组合总和 III
 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。

 说明：

 所有数字都是正整数。
 解集不能包含重复的组合。
 示例 1:

 输入: k = 3, n = 7
 输出: [[1,2,4]]
 示例 2:

 输入: k = 3, n = 9
 输出: [[1,2,6], [1,3,5], [2,3,4]]
 */

package Question.Array.Q216_pass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 执行用时：
 4 ms, 在所有 Java 提交中击败了69.81%的用户
 内存消耗：
 37.7 MB, 在所有 Java 提交中击败了5.01%的用户

 还有可优化的空间，求和这部分存在很多重复的计算
 */
public class Solution1 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();

        LinkedList<ArrayList> queue = new LinkedList<>();

        for (int i = 1; i < 10 ; i++) {
            ArrayList<Integer> tmp = new ArrayList();
            tmp.add(i);
            queue.add(tmp);
        }

        int level = 1;
        System.out.println(queue);

        while (level <= k) {
            int size = queue.size();


            for (int i = 0; i < size; i++) {
                ArrayList<Integer> num = queue.poll();
                int last = num.get(num.size() - 1);
                for (int j = last + 1; j < 10; j++) {
                    ArrayList<Integer> temp = new ArrayList<>(num);
                    temp.add(j);

                    int sum = 0;
                    for (Integer integer : temp) {
                        sum += integer;
                    }

                    if (sum == n && level == k -1) {
                        result.add(temp);
                    } else if (sum < n) {
                        queue.add(temp);
                    } else {
                        break;
                    }


                }
            }


            level++;
        }

        System.out.println(result);
        return result;
    }
}
