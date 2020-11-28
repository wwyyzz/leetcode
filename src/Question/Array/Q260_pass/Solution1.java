/**
 260. 只出现一次的数字 III
 给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。
 找出只出现一次的那两个元素。

 示例 :
 输入: [1,2,1,3,2,5]
 输出: [3,5]

 注意：
 结果输出的顺序并不重要，对于上面的例子， [5, 3] 也是正确答案。
 你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？
 */

package Question.Array.Q260_pass;

import java.util.Arrays;
import java.util.HashSet;

/**
 执行用时：
 4 ms, 在所有 Java 提交中击败了34.16%的用户
 内存消耗：
 39 MB, 在所有 Java 提交中击败了44.80%的用户
 */
public class Solution1 {
    public int[] singleNumber(int[] nums) {


        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        System.out.println(set);

        int[] result = new int[2];
        int i = 0;
        for (Integer integer : set) {
            result[i++] = integer;
        }
        System.out.println(Arrays.toString(result));
        return result;

    }
}
