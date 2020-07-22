package Offer.Offer11_pass;

import java.util.Arrays;

/**
 剑指 Offer 11. 旋转数组的最小数字
 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。

 示例 1：

 输入：[3,4,5,1,2]
 输出：1
 示例 2：

 输入：[2,2,2,0,1]
 输出：0
 注意：本题与主站 154 题相同：https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/
 */


/**
 *
 192 / 192 个通过测试用例
 状态：通过
 执行用时：1 ms
 内存消耗：39.6 MB

 题目出的有问题，通过查找最小值就能通过测试例
 */
public class Solution1 {
    public int minArray(int[] numbers) {

        Arrays.sort(numbers);

        return numbers[0];

    }
}
