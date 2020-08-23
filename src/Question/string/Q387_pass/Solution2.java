/**
 * 387. 字符串中的第一个唯一字符
 * 题目描述提示帮助提交记录社区讨论阅读解答
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 案例:
 *
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 *
 *
 * 注意事项：您可以假定该字符串只包含小写字母。
 *
 * 104 / 104 个通过测试用例
 * 状态：通过
 * 执行用时：40 ms
 */

package Question.string.Q387_pass;

/**
 * 104 / 104 个通过测试用例
 * 状态：通过
 * 执行用时：33 ms
 * 内存消耗：40 MB
 *
 */
public class Solution2 {
    public int firstUniqChar(String s) {

        for (int i = 0; i < s.length()  ; i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }

        return -1;
    }
}
