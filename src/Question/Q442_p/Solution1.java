/**
 * 442. 数组中重复的数据
 * 给定一个整数数组 a，其中1 ≤ a[i] ≤ n （n为数组长度）, 其中有些元素出现两次而其他元素出现一次。
 * 找到所有出现两次的元素。
 *
 * 你可以不用到任何额外空间并在O(n)时间复杂度内解决这个问题吗？
 *
 * 示例：

 * 输入:
 * [4,3,2,7,8,2,3,1]
 * 输出:
 * [2,3]
 *
 */
package Question.Q442_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 28 / 28 个通过测试用例
 * 状态：通过
 * 执行用时：58 ms
 *
 * 我的提交执行用时
 * 已经战胜 16.08 % 的 java 提交记录
 */
public class Solution1 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]){
                list.add(nums[i]);
            }
        }

        System.out.println(list);
        return list;
    }
}
