/**
 506. 相对名次
 给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。
 前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”（"Gold Medal", "Silver Medal", "Bronze Medal"）。

 (注：分数越高的选手，排名越靠前。)

 示例 1:
 输入: [5, 4, 3, 2, 1]
 输出: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 解释: 前三名运动员的成绩为前三高的，因此将会分别被授予 “金牌”，“银牌”和“铜牌” ("Gold Medal", "Silver Medal" and "Bronze Medal").
 余下的两名运动员，我们只需要通过他们的成绩计算将其相对名次即可。
 提示:

 N 是一个正整数并且不会超过 10000。
 所有运动员的成绩都不相同。
 */

package Question.Q506_pass;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 执行用时：
 14 ms, 在所有 Java 提交中击败了45.93%的用户
 内存消耗：
 39.5 MB, 在所有 Java 提交中击败了90.86%的用户
 */
public class Solution1 {
    public String[] findRelativeRanks(int[] nums){
        String[] result = new String[nums.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map. put(nums[i], i);
        }

        Integer[] new_nums = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            new_nums[i] = nums[i];
        }
        Arrays.sort(new_nums, Collections.reverseOrder());

        System.out.println(Arrays.toString(new_nums));

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int index = map.get(new_nums[i]);
            switch (i) {
                case 0 :
                    result[index] = "Gold Medal";
                    break;
                case 1:
                    result[index] = "Silver Medal";
                    break;
                case 2:
                    result[index] = "Bronze Medal";
                    break;
                default:
                    result[map.get(new_nums[i])] = "" + (i + 1);
            }
        }

        System.out.println(Arrays.toString(result));

        return result;

    }
}
