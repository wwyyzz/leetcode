/**
 238. 除自身以外数组的乘积
 给你一个长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。

 示例:

 输入: [1,2,3,4]
 输出: [24,12,8,6]


 提示：题目数据保证数组之中任意元素的全部前缀元素和后缀（甚至是整个数组）的乘积都在 32 位整数范围内。

 说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。

 进阶：
 你可以在常数空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组不被视为额外空间。）
 */

package Question.Array.Q238_p;

import java.util.Arrays;

/**
 时间复杂度为O(n)，满足题目要求
 空间复杂度满足要求
 */
public class Solution3 {
    public int[] productExceptSelf(int[] nums){
        int[] result = new int[nums.length];
//        int[] left = new int[nums.length];
//        int[] right = new int[nums.length];

        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        System.out.println(Arrays.toString(result));

        int right = 1;
        for (int i = nums.length -1; i >= 0; i--) {
            result[i] = result[i] * right;
            right *= nums[i];
        }
        System.out.println(Arrays.toString(result));


        System.out.println(Arrays.toString(result));

        return result;

    }
}
