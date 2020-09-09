/**
 39. 组合总和
 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 candidates 中的数字可以无限制重复被选取。

 说明：
 所有数字（包括 target）都是正整数。
 解集不能包含重复的组合。

 示例 1：
 输入：candidates = [2,3,6,7], target = 7,
 所求解集为：
 [
 [7],
 [2,2,3]
 ]

 示例 2：
 输入：candidates = [2,3,5], target = 8,
 所求解集为：
 [
 [2,2,2,2],
 [2,3,3],
 [3,5]
 ]


 提示：
 1 <= candidates.length <= 30
 1 <= candidates[i] <= 200
 candidate 中的每个元素都是独一无二的。
 1 <= target <= 500
 */

package Question.Array.Q39_pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**

 */
public class Solution1 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        LinkedList<LinkedList> queue = new LinkedList<>();

        Arrays.sort(candidates);

        for (int candidate : candidates) {
            LinkedList<Integer> tmp = new LinkedList();
            tmp.add(candidate);
            queue.add(tmp);
            if (candidate == target) {
                result.add(tmp);
            }
        }

        System.out.println(queue);

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                LinkedList<Integer> list = queue.poll();
                for (int candidate : candidates) {
                    LinkedList<Integer> poll = new LinkedList<>(list);
                    if ((poll.getLast()) <= candidate) {
                        poll.add(candidate);
                        int sum = 0;

                        for (Integer o : poll) {
                            sum += o;
                        }

                        if (sum < target) {
                            queue.add(poll);
                        } else if (sum == target) {
                            result.add(poll);
                        }
                    }

                }
            }
        }
        System.out.println(result);
        return result;
    }
}
