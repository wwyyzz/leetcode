package Question.Q268_pass;

/**
 * @program: leetcode
 * @description: Question.Q268
 * @author: Jun Wang
 * @create: 2018-12-14 16:51
 */

/**
 * 268. 缺失数字
  * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 *
 * 示例 1:
 * 输入: [3,0,1]
 * 输出: 2
 *
 * 示例 2:
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 *
 * 说明:
 * 你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
 */

/**
 *
 122 / 122 个通过测试用例
 状态：通过
 执行用时：2 ms
 已经战胜 52.50 % 的 java 提交记录
 */
public class Solution1 {
    public int missingNumber(int[] nums) {
//        计算n个数的和sum
        int sum = (nums.length + 1) * nums.length / 2;
        System.out.println(sum);
//        遍历数组
//                从sum中逐个减去元素
//        for (int i = 0; i < nums.length; i++) {
//            int num = nums[i];
//            sum -= num;
//
//        }
        for(int i : nums){
            sum -= i;
        }

//        返回sum的值
        return sum;
    }
}
