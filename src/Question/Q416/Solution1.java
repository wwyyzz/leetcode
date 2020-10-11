/**
 416. 分割等和子集
 给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。

 注意:

 每个数组中的元素不会超过 100
 数组的大小不会超过 200

 示例 1:
 输入: [1, 5, 11, 5]
 输出: true
 解释: 数组可以分割成 [1, 5, 5] 和 [11].

 示例 2:
 输入: [1, 2, 3, 5]
 输出: false
 解释: 数组不能分割成两个元素和相等的子集.
 */

package Question.Q416;

import java.util.ArrayList;

/**
超时
 */
public class Solution1 {
    public boolean canPartition(int[] nums) {

        int len = nums.length;
        ArrayList<StringBuilder> bits = new ArrayList<>();
        int pow = (int)(Math.pow(2, len) - 1);
        for (int i = 1; i < pow; i++) {
            StringBuilder sb = new StringBuilder(Integer.toBinaryString(i));
            while (sb.length() < len) {
                sb.insert(0,'0');
            }
            bits.add(sb);
        }

        System.out.println(bits);

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0) {
            return false;
        } else {
            int half = sum / 2;

            for (StringBuilder bit : bits) {
                int total = 0;
                char[] chars = bit.toString().toCharArray();
                for (int i = 0; i < len; i++) {
                    if (chars[i] == '1') {
                        total += nums[i];
                    }
                }
                if (total == half) {
                    return true;
                }
            }
        }
        return false;

    }
}
