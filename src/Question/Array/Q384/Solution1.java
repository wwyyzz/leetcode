/**
 384. 打乱数组
 打乱一个没有重复元素的数组。

 示例:
 // 以数字集合 1, 2 和 3 初始化数组。
 int[] nums = {1,2,3};
 Solution solution = new Solution(nums);

 // 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
 solution.shuffle();

 // 重设数组到它的初始状态[1,2,3]。
 solution.reset();

 // 随机返回数组[1,2,3]打乱后的结果。
 solution.shuffle();
 */

package Question.Array.Q384;

import java.util.Arrays;

/**

 */
public class Solution1 {
    int[] arr ;
    public Solution1(int[] nums) {
        System.arraycopy(nums,0, arr,0,nums.length);
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return arr;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] shuff = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            shuff[i] = arr[(int)(Math.random() * 10 % 3)];
        }
        return shuff;
    }
}
