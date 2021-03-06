/**
 Offer 56 - II. 数组中数字出现的次数 II
 在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。

 示例 1：
 输入：nums = [3,4,3,3]
 输出：4

 示例 2：
 输入：nums = [9,1,7,9,7,9,7]
 输出：1

 限制：
 1 <= nums.length <= 10000
 1 <= nums[i] < 2^31
 */

package Offer.Offer56_II_pass;

import java.util.Arrays;

/**
 执行用时：
 7 ms, 在所有 Java 提交中击败了68.34%的用户
 内存消耗：
 39.2 MB, 在所有 Java 提交中击败了94.59%的用户
 */
public class Solution2 {
    public int singleNumber(int[] nums){
        int result;

        Arrays.sort(nums);

        for (int i = 0; i < (nums.length - 3); i = i + 3) {
            if ((nums[i] != nums[i + 1]) || (nums[i + 1] != nums[i + 2])) {
                return nums[i];
            }
        }
        result = nums[nums.length - 1];
        return result;

    }
}
