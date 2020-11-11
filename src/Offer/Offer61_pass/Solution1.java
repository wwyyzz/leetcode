/**
 剑指 Offer 61. 扑克牌中的顺子
 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。
 2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。

 示例 1:
 输入: [1,2,3,4,5]
 输出: True

 示例 2:
 输入: [0,0,1,2,5]
 输出: True

 限制：
 数组长度为 5
 数组的数取值为 [0, 13] .
 */

package Offer.Offer61_pass;

import java.util.Arrays;

/**
 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 36 MB, 在所有 Java 提交中击败了83.95%的用户
 */
public class Solution1 {
    public boolean isStraight(int[] nums){
        int[] poker = new int[14];
        int joker = 0;
        int min = 14;
        int max = -1;
        for (int num : nums) {
            if (num == 0) {
                joker++;
                continue;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            if (poker[num] == 0) {
                poker[num] = 1;
            } else {
                return false;
            }

        }

        System.out.println("joker   :" + joker);
        System.out.println("min    :" + min);
        System.out.println("max    :" + max);
        System.out.println(Arrays.toString(poker));

        int zero = 0;
        for (int i = min + 1; i < max ; i++) {
            if (poker[i] == 0) {
                zero++;
            }
        }

        return zero <= joker;

    }
}
