/**
 77. 组合
 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。

 示例:

 输入: n = 4, k = 2
 输出:
 [
     [2,4],
     [3,4],
     [2,3],
     [1,2],
     [1,3],
     [1,4],
 ]
 */

package Question.Array.Q77_pass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 执行用时：
 109 ms, 在所有 Java 提交中击败了5.61%的用户
 内存消耗：
 101.1 MB, 在所有 Java 提交中击败了5.14%的用户
 */
public class Solution1 {
    public List<List<Integer>> combine(int n, int k) {

        LinkedList<List<Integer>> queue = new LinkedList<>();

        for (int i = 1; i <= n ; i++) {
            ArrayList num = new ArrayList();
            num.add(i);
            queue.add(num);
        }

        System.out.println(queue);

        int level = 1;
        while (level < k) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                List list = queue.poll();
                int len = list.size();
                int last = (int)list.get(len -1);
                System.out.println("last  :" + last);
                for (int j = last + 1; j <= n; j++) {
                    List tmp = new ArrayList(list);
                    tmp.add(j);
                    queue.add(tmp);
                }
            }

            level++;
        }

        System.out.println(queue);

        List<List<Integer>> result = new ArrayList<>(queue);

        System.out.println(result);
        return result;

    }
}
