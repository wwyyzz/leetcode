/**
 643. 子数组最大平均数 I
 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。

 示例 1:
 输入: [1,12,-5,-6,50,3], k = 4
 输出: 12.75
 解释: 最大平均数 (12-5-6+50)/4 = 51/4 = 12.75

 注意:
 1 <= k <= n <= 30,000。
 所给数据范围 [-10,000，10,000]。
 */

package Question.SlidingWindowAndTwoPointers.Q643_pass;

/**
 执行用时：
 2 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 42.7 MB, 在所有 Java 提交中击败了36.60%的用户
 */
public class Solution2 {
    public double findMaxAverage(int[] nums, int k){
        int result = 0;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        result = sum;

        for (int i = k; i < nums.length ; i++) {
            sum = sum - nums[i -k] + nums[i];

            if (sum > result) {
                result = sum;
            }
        }

        System.out.println("result :" + result);
        return result * 1.0 / k;

    }
}
