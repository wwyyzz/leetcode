/**
 * 628. 三个数的最大乘积
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 *
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: 6
 *
 * 示例 2:
 * 输入: [1,2,3,4]
 * 输出: 24
 *
 * 注意:
 * 给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。
 * 输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。
 */
package Question.Q628_pass;

import java.util.Arrays;

/**
 * 83 / 83 个通过测试用例
 * 状态：通过
 * 执行用时：27 ms
 *
 * 我的提交执行用时
 * 已经战胜 69.66 % 的 java 提交记录
 */
public class Solution1 {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int result1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int result2 = nums[nums.length - 1] * nums[1] * nums[0];

        System.out.println(result1);
        System.out.println(result2);
        return Math.max(result1,result2);
    }
}
