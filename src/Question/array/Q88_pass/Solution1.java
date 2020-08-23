package Question.array.Q88_pass;

/**
 * @program: leetcode
 * @description: Question.Q88
 * @author: Jun Wang
 * @create: 2018-12-17 14:09
 */

import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * 说明:
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *
 * 示例:
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * 输出: [1,2,2,3,5,6]
 */

/**
 * 59 / 59 个通过测试用例
 * 状态：通过
 * 执行用时：6 ms
 * 已经战胜 28.47 % 的 java 提交记录
 */
public class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        遍历nums2
//        将nums2[]中的元素逐个复制到num1的num1[m]开始
//        和 System.arraycopy(nums2,0,nums1,m,n);  效果一样
//        for (int i = 0; i < nums2.length; i++) {
//            nums1[m + i] = nums2[i];
//        }
        System.arraycopy(nums2,0,nums1,m,n);
//       对于nums1进行了排序
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
