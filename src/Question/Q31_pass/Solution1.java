/**
 31. 下一个排列
 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。

 必须原地修改，只允许使用额外常数空间。

 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 1,2,3 → 1,3,2
 3,2,1 → 1,2,3
 1,1,5 → 1,5,1
 */

package Question.Q31_pass;

import java.util.Arrays;

/**
 执行用时：
 1 ms, 在所有 Java 提交中击败了98.72%的用户
 内存消耗：
 38.8 MB, 在所有 Java 提交中击败了68.68%的用户
 */
public class Solution1 {
    public void nextPermutation(int[] nums) {
        //1 5 2 4 3 2
        System.out.println(Arrays.toString(nums));

        for (int i = (nums.length - 1); i >= 0; i--) {
            for (int j = (nums.length - 1); j > i ; j--) {
                if (nums[j] > nums[i]) {
                    swap(nums, i, j);

                    int k = i + 1;
                    int l = nums.length - 1;

                    while (k < l) {
                        swap(nums, k, l);
                        k++;
                        l--;
                    }

                    System.out.println(Arrays.toString(nums));
                    return;
                }
            }
        }

        int k = 0;
        int l = nums.length - 1;

        while (k < l) {
            swap(nums, k , l);
            k++;
            l--;
        }
        System.out.println(Arrays.toString(nums));
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


}
