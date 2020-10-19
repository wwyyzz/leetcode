/**
 5543. 两个相同字符之间的最长子字符串 显示英文描述

 给你一个字符串 s，请你返回 两个相同字符之间的最长子字符串的长度 ，计算长度时不含这两个字符。如果不存在这样的子字符串，返回 -1 。
 子字符串 是字符串中的一个连续字符序列。

 示例 1：
 输入：s = "aa"
 输出：0
 解释：最优的子字符串是两个 'a' 之间的空子字符串。

 示例 2：
 输入：s = "abca"
 输出：2
 解释：最优的子字符串是 "bc" 。

 示例 3：
 输入：s = "cbzxy"
 输出：-1
 解释：s 中不存在出现出现两次的字符，所以返回 -1 。

 示例 4：
 输入：s = "cabbac"
 输出：4
 解释：最优的子字符串是 "abba" ，其他的非最优解包括 "bb" 和 "" 。

 提示：
 1 <= s.length <= 300
 s 只含小写英文字母
 */

package Contest.W211.Q5543;

/**

 */
public class Solution1 {
    public int maxLengthBetweenEqualCharacters(String s) {
        int result = -1;

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = chars.length - 1; j >0 ; j--) {
                if (chars[i] == chars[j]) {
                    if ((j - i - 1) > result) {
                        result = j - i - 1;
                    }
                }
            }
        }

        return result;

    }
}
