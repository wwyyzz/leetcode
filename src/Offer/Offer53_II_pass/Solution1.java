/**
 剑指 Offer 53 - II. 0～n-1中缺失的数字
 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。

 示例 1:
 输入: [0,1,3]
 输出: 2

 示例 2:
 输入: [0,1,2,3,4,5,6,7,9]
 输出: 8

 限制：
 1 <= 数组长度 <= 10000
 */

package Offer.Offer53_II_pass;

/**
 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 39.1 MB, 在所有 Java 提交中击败了79.71%的用户
 */
public class Solution1 {
    public int missingNumber(int[] nums){
        int result = 0;

        int sum = 0 ;
        for (int num : nums) {
            sum += num;
        }


        return  nums.length * (nums.length + 1) / 2- sum;

    }
}
