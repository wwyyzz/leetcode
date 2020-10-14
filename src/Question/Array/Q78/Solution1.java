package Question.Array.Q78;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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


public class Solution1 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        LinkedList<List<Integer>> queue = new LinkedList<>();

        for (int i = 0; i <= nums.length ; i++) {
            ArrayList num = new ArrayList();
            num.add(nums[i]);
            queue.add(num);
            result.add(num);
        }

        System.out.println(queue);
        System.out.println(result);

        int level = 1;
        while (level <= nums.length) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                List list = queue.poll();
                int len = list.size();
                int last = (int)list.get(len -1);
                System.out.println("last  :" + last);
                for (int j = last + 1; j <= len; j++) {
                    List tmp = new ArrayList(list);
                    tmp.add(j);
                    queue.add(tmp);
                }
            }

            level++;
        }

        System.out.println(queue);

        result.addAll(queue);

        System.out.println(result);
        return result;

    }
}
