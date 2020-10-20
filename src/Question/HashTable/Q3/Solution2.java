/**
 3. 无重复字符的最长子串
 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

 示例 1:
 输入: "abcabcbb"
 输出: 3
 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

 示例 2:
 输入: "bbbbb"
 输出: 1
 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。

 示例 3:
 输入: "pwwkew"
 输出: 3
 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */

package Question.HashTable.Q3;

import java.util.HashSet;

/**

 */
public class Solution2 {
    public int lengthOfLongestSubstring(String s){
        int result = 1;

        for (int i = s.length(); i > 0 ; i--) {
            for (int j = 0; j < s.length() - i; j++) {
                String sub = s.substring(j, j + i + 1);
                System.out.println("sub  :" + sub);
                if (!isRepeat(sub)) {
                    return sub.length();
                }
            }
        }

        return result;

    }

    private boolean isRepeat(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }

        return set.size() != s.length();
    }
}
