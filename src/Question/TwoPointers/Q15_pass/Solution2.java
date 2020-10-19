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
package Question.TwoPointers.Q15_pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 执行用时：
 25 ms, 在所有 Java 提交中击败了59.81%的用户
 内存消耗：
 42.7 MB, 在所有 Java 提交中击败了67.71%的用户
 */
public class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            //用来去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int L = i + 1;
            int R = nums.length - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    List<Integer> tmp = Arrays.asList(nums[i], nums[L], nums[R]);
                    result.add(tmp);
                    //用来去重
                    while (L < R && nums[L] == nums[L + 1]) {
                        L++;
                    }
                    //用来去重
                    while (L < R && nums[R] == nums[R - 1]) {
                        R--;
                    }
                    //移动指针，继续寻找下一组
                    L++;
                    R--;

                } else if (sum < 0) {
                    L++;
                } else {
                    R--;
                }

            }
        }

        System.out.println(result);
        return result;
    }
}
