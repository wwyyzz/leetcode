package Offer.Offer03_pass;

import java.util.HashMap;

/**
 剑指 Offer 03. 数组中重复的数字
 找出数组中重复的数字。

 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

 示例 1：
 输入：
 [2, 3, 1, 0, 2, 5, 3]
 输出：2 或 3

 限制：
 2 <= n <= 100000
 */

/**
 执行用时：
 9 ms, 在所有 Java 提交中击败了22.81%的用户
 内存消耗：
 47.4 MB, 在所有 Java 提交中击败了38.83%的用户
 */
public class Solution2 {
    public int findRepeatNumber(int[] nums) {
        int result = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                return num;
            } else {
                map.put(num, 1);
            }
        }

        return result;


    }
}
