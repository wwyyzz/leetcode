/**
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 *
 * 示例 1:
 * 输入: [3, 2, 1]
 * 输出: 1
 * 解释: 第三大的数是 1.
 *
 * 示例 2:
 * 输入: [1, 2]
 * 输出: 2
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 *
 * 示例 3:
 * 输入: [2, 2, 3, 1]
 * 输出: 1
 *
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 */
package Q414;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public int thirdMax(int[] nums) {
//        将nums排序
        Arrays.sort(nums);
//        result = 最大的那个
        int result = nums[nums.length - 1];

//        if (nums.length < 3){
//            return result;
//        }

//        count = 3
        int count = 3;
//        从大到小开始遍历数组（倒序）
//        for (int i = nums.length - 1; i > 0; i--) {
//            if (count == 1) {
//                return nums[i];
//            }else if ( nums[i - 1] < nums[i]){
//                count--;
//            }
//
//        }

        Set<Integer> set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            set.add(num);
        }

        if (set.size() < 3){
            return result;
        }else {
            Object[] arr = set.toArray();
            return (int)arr[set.size() - 3];
        }
//        如果 count == 1 则返回nums[i]
//        如果nums[i-1] 比nums[i]小则，count--

    }
}

/**
 *
 26 / 26 个通过测试用例
 状态：通过
 执行用时：15 ms
 已经战胜 21.83 % 的 java 提交记录
 */
class Solution2 {
    public int thirdMax(int[] nums) {
//        将nums排序
        Arrays.sort(nums);
//        result = 最大的那个
        int result = nums[nums.length - 1];

//        将nums转为set
        Set<Integer> set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            set.add(num);
        }
//        如果 set.size < 3 ,返回最大的
//        否则，将set转为array，返回倒数第三个
        if (set.size() < 3){
            return result;
        }else {
            Object[] arr = set.toArray();
            Arrays.sort(arr);
            return (int)arr[arr.length - 3];
        }


    }
}