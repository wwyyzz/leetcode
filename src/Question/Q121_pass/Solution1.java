/**
 121. 买卖股票的最佳时机
 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
 注意：你不能在买入股票前卖出股票。

 示例 1:

 输入: [7,1,5,3,6,4]
 输出: 5
 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。

 示例 2:
 输入: [7,6,4,3,1]
 输出: 0
 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 */

package Question.Q121_pass;

import java.util.Arrays;

/**
 执行用时：
 384 ms, 在所有 Java 提交中击败了5.01%的用户
 内存消耗：
 38.4 MB, 在所有 Java 提交中击败了98.44%的用户
 */
public class Solution1 {
    public int maxProfit(int[] prices) {

        int result = 0;
        if (prices.length <= 1) {
            return result;
        }

        int[] maxValues = new int[prices.length - 1];

        for (int i = 0; i < prices.length - 1; i++) {
            int max = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if ((prices[j] - prices[i]) > max) {
                    max = prices[j] - prices[i];
                }
            }
            maxValues[i] = max;
        }

        Arrays.sort(maxValues);

        return maxValues[maxValues.length - 1];

    }
}
