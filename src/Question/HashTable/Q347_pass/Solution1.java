/**
 347. 前 K 个高频元素
 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。

 示例 1:
 输入: nums = [1,1,1,2,2,3], k = 2
 输出: [1,2]

 示例 2:
 输入: nums = [1], k = 1
 输出: [1]

 提示：
 你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
 你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
 题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的。
 你可以按任意顺序返回答案。
 */

package Question.HashTable.Q347_pass;

import java.util.*;

/**

 */
public class Solution1 {
    public int[] topKFrequent(int[] nums, int k){
        int[] result = new int[k];

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        System.out.println(map);

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

//        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                return o2.getValue().compareTo(o1.getValue());
//            }
//        });

        System.out.println(list);

        for (int i = 0; i < k ; i++) {
            result[i] = list.get(i).getKey();
        }

        System.out.println(Arrays.toString(result));
        return result;

    }
}
