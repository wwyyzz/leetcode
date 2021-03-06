/**
 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。

 示例：

 输入：nums = [1,2,3,4]
 输出：[1,3,2,4]
 注：[3,1,2,4] 也是正确的答案之一。

 提示：
 1 <= nums.length <= 50000
 1 <= nums[i] <= 10000
 */

package Offer.Offer21_pass;

import java.util.Arrays;

/**
 使用双指针
 执行用时：
 2 ms, 在所有 Java 提交中击败了99.78%的用户
 内存消耗：
 46.7 MB, 在所有 Java 提交中击败了58.48%的用户
 */
public class Solution1 {
    public int[] exchange(int[] nums){
        int L = 0;
        int R = nums.length - 1;

        while (L < R) {
            while (L < R &&  nums[L] % 2 != 0) {
                L++;
            }

            while (L < R && nums[R] % 2 == 0) {
                R--;
            }

            int tmp = nums[L];
            nums[L] = nums[R];
            nums[R] = tmp;

//            L++;
//            R--;
        }

        System.out.println(Arrays.toString(nums));

        return nums;

    }
}
