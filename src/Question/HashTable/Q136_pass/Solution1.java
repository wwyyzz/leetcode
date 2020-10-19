//136. 只出现一次的数字
//        题目描述提示帮助提交记录社区讨论阅读解答
//        给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
//        说明：
//
//        你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
//
//        示例 1:
//
//        输入: [2,2,1]
//        输出: 1
//        示例 2:
//
//        输入: [4,1,2,1,2]
//        输出: 4

package Question.HashTable.Q136_pass;
import java.util.*;

/**
 * 16 / 16 个通过测试用例
 * 状态：通过
 * 执行用时: 483 ms
 * 内存消耗: 41.6 MB
 */
public class Solution1 {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();

        for (Integer i:nums
        ) {
            list1.add(i);
        }

        Set<Integer> set = new HashSet<>(list1);

        ArrayList<Integer> list2 = new ArrayList<>(set);

        for (Integer i:list2
        ) {
            list1.remove(i);
        }
        for (Integer i:list1
        ) {
            list2.remove(i);
        }

        return list2.get(0);

    }
}

