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
 35.9 MB, 在所有 Java 提交中击败了97.42%的用户
 */
public class Solution1 {
    public boolean isUnique(String astr){
        boolean result = true;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : astr.toCharArray()) {
            if (map.containsKey(c)) {
                return false;
            } else {
                map.put(c , 1);
            }
        }
        return result;

    }
}
