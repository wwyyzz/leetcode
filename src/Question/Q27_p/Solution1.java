/**
 * 27. 移除元素
 *
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * 示例 1:
 *
 * 给定 nums = [3,2,2,3], val = 3,
 *
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 *
 * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 *
 * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 *
 * 注意这五个元素可为任意顺序。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 * 说明:
 *
 * 为什么返回数值是整数，但输出的答案是数组呢?
 *
 * 请注意，输入数组是以“引用”方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 *
 * 你可以想象内部操作如下:
 *
 * // nums 是以“引用”方式传递的。也就是说，不对实参作任何拷贝
 * int len = removeElement(nums, val);
 *
 * // 在函数里修改输入数组对于调用者是可见的。
 * // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
 * for (int i = 0; i < len; i++) {
 *     print(nums[i]);
 * }
 */
package Question.Q27_p;

import java.util.Arrays;

public class Solution1 {
    public int removeElement(int[] nums, int val) {
        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length - 1);
        int result = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
//            System.out.println("nums[i] = " + nums[i]);
            if (nums[i] == val){
                result++;
                continue;
            }
            else{
                for (int j = i - 1; j >=0 ; j--) {
                    System.out.println("nums[i] = " + nums[i]);
                    System.out.println("nums[j] = " + nums[j]);
                    if (nums[j] == val){
                        nums[i] = nums[j];
//                        nums[j] = val;
                        result++;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length - result;
    }
}

/**
 * 113 / 113 个通过测试用例
 * 状态：通过
 * 执行用时：6 ms
 *
 * 我的提交执行用时
 * 已经战胜 94.29 % 的 java 提交记录
 *
 * nums = Arrays.copyOf(remove, result);
 * 后 nums的地址就变了，没有办法返回nums[]
 * [I@6477463f
 * [2, 2, 0, 0]
 * [2, 2]
 * [I@3d71d552
 *
 *     public static int[] copyOf(int[] original, int newLength) {
 *         int[] copy = new int[newLength];
 *         System.arraycopy(original, 0, copy, 0,
 *                          Math.min(original.length, newLength));
 *         return copy;
 *     }
 */
class Solution2 {
    public int removeElement(int[] nums, int val) {
        System.out.println(Arrays.toString(nums));
        int result = 0;
        int[] remove = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                remove[result] = nums[i];
                result++;
            }
        }
        System.out.println(Arrays.toString(remove));
        nums = Arrays.copyOf(remove, result);
//        for (int i = 0; i < remove.length; i++) {
//            nums[i] = remove[i];
//        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums));
        return result;
    }
}