/**
 540. 有序数组中的单一元素
 给定一个只包含整数的有序数组，每个元素都会出现两次，唯有一个数只会出现一次，找出这个数。

 示例 1:
 输入: [1,1,2,3,3,4,4,8,8]
 输出: 2

 示例 2:
 输入: [3,3,7,7,10,11,11]
 输出: 10
 注意: 您的方案应该在 O(log n)时间复杂度和 O(1)空间复杂度中运行。
 */

package Question.Array.Q540_pass;

/**
 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 38.8 MB, 在所有 Java 提交中击败了85.87%的用户
 */
public class Solution1 {
    public int singleNonDuplicate(int[] nums) {
//        if (nums.length == 1) {
//            return nums[0];
//        }
        int result = 0;

        for (int i = 0; i < nums.length - 1; i = i + 2) {
            if (nums[i] != nums[i + 1]) {
                result = nums[i];
                return  result;
            }
        }
        System.out.println(result);

        return nums[nums.length - 1];

    }
}
