/**
 剑指 Offer 39. 数组中出现次数超过一半的数字
 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。

 你可以假设数组是非空的，并且给定的数组总是存在多数元素。

 示例 1:
 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
 输出: 2

 限制：
 1 <= 数组长度 <= 50000

 注意：本题与主站 169 题相同：https://leetcode-cn.com/problems/majority-element/
 */

package Offer.Offer39_pass;

import java.util.HashMap;

/**
 执行用时：
 24 ms, 在所有 Java 提交中击败了6.37%的用户
 内存消耗：
 44 MB, 在所有 Java 提交中击败了12.20%的用户
 */
public class Solution1 {
    public int majorityElement(int[] nums){
        int result = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > (nums.length / 2)) {
                return num;
            }
        }

        return result;
    }
}
