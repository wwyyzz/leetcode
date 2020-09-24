/**
 219. 存在重复元素 II
 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。

 示例 1:
 输入: nums = [1,2,3,1], k = 3
 输出: true

 示例 2:
 输入: nums = [1,0,1,1], k = 1
 输出: true

 示例 3:
 输入: nums = [1,2,3,1,2,3], k = 2
 输出: false
 */

package Question.HashTable.Q219_pass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 执行用时：
 19 ms, 在所有 Java 提交中击败了25.11%的用户
 内存消耗：
 48.5 MB, 在所有 Java 提交中击败了5.05%的用户
 */
public class Solution1 {
    public boolean containsNearbyDuplicate(int[] nums, int k){
        boolean result = false;

        HashMap<Integer , ArrayList> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                ArrayList<Integer> indexs = new ArrayList<>();
                indexs.add(i);
                map.put(nums[i], indexs);
            } else {
                map.get(nums[i]).add(i);
            }
        }

        System.out.println(map);

        for (Map.Entry<Integer, ArrayList> entry : map.entrySet()) {
            ArrayList<Integer> indexs = new ArrayList<>();
            indexs = entry.getValue();
            for (int i = 1; i < indexs.size(); i++) {
                if ((indexs.get(i) - indexs.get(i - 1)) <= k) {
                    return true;
                }
            }
        }

        return result;
    }
}
