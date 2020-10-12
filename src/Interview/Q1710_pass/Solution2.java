/**
 面试题 17.10. 主要元素
 数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。

 示例 1：
 输入：[1,2,5,9,5,9,5,5,5]
 输出：5

 示例 2：
 输入：[3,2]
 输出：-1

 示例 3：
 输入：[2,2,1,1,1,2,2]
 输出：2

 说明：
 你有办法在时间复杂度为 O(N)，空间复杂度为 O(1) 内完成吗？
 */

package Interview.Q1710_pass;

import java.util.Arrays;

/**
 执行用时：
 3 ms, 在所有 Java 提交中击败了45.32%的用户
 内存消耗：
 41.8 MB, 在所有 Java 提交中击败了88.61%的用户
 */
public class Solution2 {
    public int majorityElement(int[] nums){

        Arrays.sort(nums);
        int num = nums[nums.length / 2];
        int count = 1;
        int mid = nums.length / 2;

        for (int j = mid + 1; j < nums.length; j++) {
            if (nums[j] == num) {
                count++;
            } else {
                break;
            }
        }

        for (int j = mid - 1; j >= 0; j--) {
            if (nums[j] == num) {
                count++;
            } else {
                break;
            }
        }

        if (count > (nums.length / 2) ){
            return num;
        } else{
            return -1;
        }

    }
}
