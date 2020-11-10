/**
 Offer 56 - II. 数组中数字出现的次数 II
 在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。

 示例 1：
 输入：nums = [3,4,3,3]
 输出：4

 示例 2：
 输入：nums = [9,1,7,9,7,9,7]
 输出：1

 限制：
 1 <= nums.length <= 10000
 1 <= nums[i] < 2^31
 */

package Offer.Offer56_II_pass;

import java.util.HashMap;
import java.util.Map;

/**

 */
public class Solution1 {
    public int singleNumber(int[] nums){
        int result = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 3) {
                result = entry.getKey();
            }
        }
        return result;

    }
}
