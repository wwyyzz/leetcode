package Question.bitwise.Q169_pass;

/**
 * @program: leetcode
 * @description: Question.Q169
 * @author: Jun Wang
 * @create: 2018-12-14 15:48
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 169. 求众数
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 *
 * 示例 1:
 * 输入: [3,2,3]
 * 输出: 3
 *
 * 示例 2:
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 */

/**
 *  44 / 44 个通过测试用例
 *  状态：通过
 *  执行用时：19 ms
 * 已经战胜 41.61 % 的 java 提交记录
 */
public class Solution1 {
    public int majorityElement(int[] nums) {
//        创建HashMap，k=数字，value=出现的次数
        Map<Integer,Integer> map = new HashMap<>();
//        遍历数组
//            统计出现的数字，累计出现的数字
        for (Integer i :nums){
            if (map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i,1);
            }

        }

        System.out.println(map);

//        返回value中最大的key


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2){
                return entry.getKey();
            }
        }


        return 0;
    }
}


/**
 *
 44 / 44 个通过测试用例
 状态：通过
 执行用时：5 ms
 已经战胜 92.19 % 的 java 提交记录
 */
class Solution2 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        return nums[ nums.length / 2];
    }
}