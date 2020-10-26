package Question.BFS.Q78_pass;

import java.util.*;

/**
 78. 子集
 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。

 说明：解集不能包含重复的子集。

 示例:

 输入: nums = [1,2,3]
 输出:
 [
     [3],
     [1],
     [2],
     [1,2,3],
     [1,3],
     [2,3],
     [1,2],
     []
 ]
 */

/**
 * 执行用时：
 * 1 ms, 在所有 Java 提交中击败了99.42%的用户
 * 内存消耗：
 * 38.6 MB, 在所有 Java 提交中击败了96.36%的用户
 */
public class Solution2 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int len = nums.length;

        LinkedList<ArrayList<Integer>> queue = new LinkedList<>();

        ArrayList<Integer> list = new ArrayList<>();
        queue.offer(list);
        for (int i = 0; i < len; i++) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                ArrayList<Integer> curr = queue.poll();
                queue.offer(curr);

                ArrayList<Integer> new_subset = new ArrayList<>(curr);
                new_subset.add(nums[i]);
                queue.offer(new_subset);
            }

        }

//        System.out.println(queue);

        return new ArrayList<>(queue);

    }
}
