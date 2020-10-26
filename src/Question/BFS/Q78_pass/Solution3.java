package Question.BFS.Q78_pass;

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

/**
 执行用时：
 3 ms, 在所有 Java 提交中击败了7.02%的用户
 内存消耗：
 38.6 MB, 在所有 Java 提交中击败了96.14%的用户

 生成0- pow（2，n） 的所有 01 字符串，位置为‘1’的添加到list中
 */
public class Solution3 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int len = nums.length;

        for (int i = (1 << (len)); i < (1 << (len + 1)); i++) {
            ArrayList<Integer> list = new ArrayList<>();
            String bitmask = Integer.toBinaryString(i).substring(1);

            for (int i1 = 0; i1 < bitmask.toCharArray().length; i1++) {
                if (bitmask.charAt(i1) == '1') {
                    list.add(nums[i1]);
                }
            }
            result.add(list);
        }

        System.out.println(result);
        return result;

    }
}
