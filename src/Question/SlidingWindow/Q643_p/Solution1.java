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

package Question.SlidingWindow.Q643_p;

/**

 */
public class Solution1 {
    public double findMaxAverage(int[] nums, int k){
        int result = 0;

        for (int i = 0; i < nums.length - k; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += nums[i + j];
            }

            if (sum > result) {
                result = sum;
            }
        }

        System.out.println("result :" + result);
        return result * 1.0 / k;

    }
}
