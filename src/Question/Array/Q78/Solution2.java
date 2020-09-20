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


public class Solution2 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();

        int len = nums.length;

        for (int i = 0; i < (Math.pow(2, len) ); i++) {
            System.out.println(i );

        }

        return result;

    }
}
