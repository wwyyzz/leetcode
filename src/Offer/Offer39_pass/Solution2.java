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

 摩尔投票法：
 设输入数组 nums 的众数为 xx ，数组长度为 nn 。

 推论一： 若记 众数 的票数为 +1+1 ，非众数 的票数为 -1−1 ，则一定有所有数字的 票数和 > 0>0 。
 推论二： 若数组的前 aa 个数字的 票数和 = 0=0 ，则 数组剩余 (n-a)(n−a) 个数字的 票数和一定仍 >0>0 ，
 即后 (n-a)(n−a) 个数字的 众数仍为 xx 。

 根据以上推论，假设数组首个元素 n1为众数，遍历并统计票数。当发生 票数和 = 0 时，剩余数组的众数一定不变 ，这是由于：

 当 n1  = x ： 抵消的所有数字，有一半是众数 xx 。
 当 n1 != x ： 抵消的所有数字，少于或等于一半是众数 xx 。
 利用此特性，每轮假设发生 票数和 = 0=0 都可以 缩小剩余数组区间 。当遍历完成时，最后一轮假设的数字即为众数。

 算法流程:
 初始化： 票数统计 votes = 0 ， 众数 x；
 循环： 遍历数组 nums 中的每个数字 num ；
 当 票数 votes 等于 0 ，则假设当前数字 num 是众数；
 当 num = x 时，票数 votes 自增 1 ；当 num != x 时，票数 votes 自减 1 ；
 返回值： 返回 x 即可；

 */
public class Solution2 {
    public int majorityElement(int[] nums){

        int vote = 0;
        int x = 0;
        for (int num : nums) {
            if (vote == 0) {
                x = num;
            }

            vote += num == x ? 1 : -1;
        }

        return x;
    }
}
