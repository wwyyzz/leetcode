package Question.Q41_pass;

import java.util.Arrays;

/**
 * 41. 缺失的第一个正数
 * 给定一个未排序的整数数组，找出其中没有出现的最小的正整数。
 *
 * 示例 1:
 * 输入: [1,2,0]
 * 输出: 3
 *
 * 示例 2:
 * 输入: [3,4,-1,1]
 * 输出: 2
 *
 * 示例 3:
 * 输入: [7,8,9,11,12]
 * 输出: 1
 * 说明:
 *
 * 你的算法的时间复杂度应为O(n)，并且只能使用常数级别的空间。
 */

/**
 * 157 / 157 个通过测试用例
 * 状态：通过
 * 执行用时：8 ms
 * 已经战胜 91.15 % 的 java 提交记录
 */
public class Solution1 {
    public int firstMissingPositive(int[] nums) {
//        对nums排序
        Arrays.sort(nums);
        int i = 1;
//        从1开始，使用binarysearch 是否在数组中
//        while（Arrays.binarysearch(i)）{
//            i++
//        }
        System.out.println(Arrays.binarySearch(nums,3));
        while (Arrays.binarySearch(nums,i) >= 0){
            i++;
        }

        System.out.println("i = " + i);
        return i;

    }
}
