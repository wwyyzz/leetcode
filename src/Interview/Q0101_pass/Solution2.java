/**
 面试题 01.01. 判定字符是否唯一
 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。

 示例 1：
 输入: s = "leetcode"
 输出: false

 示例 2：
 输入: s = "abc"
 输出: true

 限制：
 0 <= len(s) <= 100
 如果你不使用额外的数据结构，会很加分。
 */

package Interview.Q0101_pass;

import java.util.HashMap;

/**
 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 36.2 MB, 在所有 Java 提交中击败了89.20%的用户
 */
public class Solution2 {
    public boolean isUnique(String astr){
        boolean result = true;

        char[] chars = astr.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length ; j++) {
                if (chars[i] == chars[j]) {
                    return false;
                }
            }
        }

        return result;

    }
}
