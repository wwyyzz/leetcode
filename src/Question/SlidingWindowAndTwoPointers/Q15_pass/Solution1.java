/**
 * 15. 三数之和
 * 题目描述提示帮助提交记录社区讨论阅读解答
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 */
package Question.SlidingWindowAndTwoPointers.Q15_pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 超时，需要优化
 */
public class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List> set = new HashSet<>();
//        a.add(Arrays.asList(new Integer[]{1,2,3}));
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        System.out.println("nums[i,j,k] =" + nums[i] + nums[j] + nums[k]);
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                        list.sort((o1, o2) -> o1 - o2);
                        set.add(list);
                    }
                }
            }
        }

        for (List list : set) {
            result.add(list);
        }

        System.out.println(result);
        return result;
    }
}
