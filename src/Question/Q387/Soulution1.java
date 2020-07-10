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

package Question.Q387;

public class Soulution1 {
    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length  ; i++) {
//            int result1 = s.indexOf(c[i]);
//            int result2 = s.lastIndexOf(c[i]);
            if (s.indexOf(c[i]) == s.lastIndexOf(c[i])){
                return i;
            }

        }

        return -1;
    }
}
