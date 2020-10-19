/**
 18. 四数之和
 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。

 注意：

 答案中不可以包含重复的四元组。

 示例：

 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。

 满足要求的四元组集合为：
 [
 [-1,  0, 0, 1],
 [-2, -1, 1, 2],
 [-2,  0, 0, 2]
 ]
 */

package Question.Q18_pass;


import java.util.*;

/**
 执行用时：
 444 ms, 在所有 Java 提交中击败了5.01%的用户
 内存消耗：
 39.5 MB, 在所有 Java 提交中击败了12.59%的用户
 */
public class Solution1 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        HashSet<List> map = new HashSet<>();

        for (int a = 0; a < nums.length - 3; a++) {
            for (int b = a + 1; b < nums.length - 2; b++){
                for (int c = b + 1; c < nums.length - 1; c++){
                    for (int d = c + 1; d < nums.length ; d++){

                        if ((nums[a] + nums[b] + nums[c] + nums[d]) == target){
                            List<Integer> tmp = Arrays.asList(nums[a], nums[b], nums[c], nums[d]);
                            tmp.sort((o1, o2) -> o1 - o2);

                            map.add(tmp);

                        }
                    }
                }
            }
        }

        for (List list : map) {
            result.add(list);
        }
        System.out.println(result);

        return result;
    }
}
