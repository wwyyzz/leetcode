/**
 5539. 按照频率将数组升序排序 显示英文描述

 给你一个整数数组 nums ，请你将数组按照每个值的频率 升序 排序。如果有多个值的频率相同，请你按照数值本身将它们 降序 排序。
 请你返回排序后的数组。

 示例 1：
 输入：nums = [1,1,2,2,2,3]
 输出：[3,1,1,2,2,2]
 解释：'3' 频率为 1，'1' 频率为 2，'2' 频率为 3 。

 示例 2：
 输入：nums = [2,3,1,3,2]
 输出：[1,3,3,2,2]
 解释：'2' 和 '3' 频率都为 2 ，所以它们之间按照数值本身降序排序。

 示例 3：
 输入：nums = [-1,1,-6,4,5,-6,1,4,1]
 输出：[5,-1,4,4,-6,-6,1,1,1]

 提示：
 1 <= nums.length <= 100
 -100 <= nums[i] <= 100
 */

package Contest.DW39.Q5539_pass;

import java.util.*;

/**
 180 / 180 个通过测试用例
 状态：通过
 执行用时: 6 ms
 内存消耗: 38.7 MB

 */
public class Solution1 {
    public int[] frequencySort(int[] nums){
        int[] result = new int[nums.length];

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o1.getValue() == o2.getValue()) {
                    return o2.getKey().compareTo(o1.getKey());
                } else {
                    return o1.getValue().compareTo(o2.getValue());
                }

            }
        });

        int len = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            for (int i = len; i < len + value; i++) {
                result[i] = key;
            }
            len += value;
        }

//        System.out.println(Arrays.toString(result));
        return result;
    }
}
