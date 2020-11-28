/**
 * 389. 找不同
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 *
 * 示例:
 *
 * 输入：
 * s = "abcd"
 * t = "abcde"
 *
 * 输出：
 * e
 *
 * 解释：
 * 'e' 是那个被添加的字母。
 */
package Question.HashTable.Q389_pass;

import java.util.*;

/**
 * 有问题，对于
 * "a"
 * "aa"
 * 测试无法通过
 */
public class Solution1 {
    public char findTheDifference(String s, String t) {

        HashSet s2 = new HashSet();

        for (char c:t.toCharArray()
                ) {
            s2.add(c);
        }

        for (char c:s.toCharArray()
             ) {
            s2.remove(c);
        }

        List<Character> list = new ArrayList<>(s2);


        return list.get(0);
    }
}