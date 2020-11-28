/**
 剑指 Offer 56 - I. 数组中数字出现的次数
 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。
 要求时间复杂度是O(n)，空间复杂度是O(1)。

 示例 1：
 输入：nums = [4,1,4,6]
 输出：[1,6] 或 [6,1]

 示例 2：
 输入：nums = [1,2,10,4,1,4,3,3]
 输出：[2,10] 或 [10,2]

 限制：
 2 <= nums.length <= 10000
 */

package Offer.Offer56_I;

import java.util.ArrayList;
import java.util.Arrays;

/**
 执行用时：
 8 ms, 在所有 Java 提交中击败了19.79%的用户
 内存消耗：
 40.2 MB, 在所有 Java 提交中击败了78.92%的用户
 */
public class Solution1 {
    public int[] singleNumbers(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                list.add(nums[i]);
            } else {
                i++;
            }
        }

        if (list.size() == 1) {
            list.add(nums[nums.length - 1]);
        }
        System.out.println(list);
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;


    }
}
