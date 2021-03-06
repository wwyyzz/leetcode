/**
 448. 找到所有数组中消失的数字
 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。

 找到所有在 [1, n] 范围之间没有出现在数组中的数字。

 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。

 示例:

 输入:
 [4,3,2,7,8,2,3,1]

 输出:
 [5,6]
 */

package Question.Q448_pass;

import java.util.*;

/**

 34 / 34 个通过测试用例
 状态：通过
 执行用时：39 ms
 内存消耗：48.7 MB
 */
public class Solution1 {
    public List<Integer> findDisappearedNumbers(int[] nums){
        ArrayList<Integer> result = new ArrayList<>();

        Arrays.sort(nums);

        Set set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        System.out.println(set);

        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < nums.length + 1 ; i++) {
            if (! set.contains(i)){
                result.add(i);
            }
        }

        System.out.println(result);

        return result;

    }
}
