/**
 205. 同构字符串
 给定两个字符串 s 和 t，判断它们是否是同构的。
 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。

 示例 1:
 输入: s = "egg", t = "add"
 输出: true

 示例 2:
 输入: s = "foo", t = "bar"
 输出: false

 示例 3:
 输入: s = "paper", t = "title"
 输出: true

 说明:
 你可以假设 s 和 t 具有相同的长度。
 */

package Question.HashTable.Q205;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**

 */
public class Solution1 {
    public boolean isIsomorphic(String s, String t){
        boolean result = true;

        HashMap<Character, Integer> map_s = new HashMap<>();
        HashMap<Character, Integer> map_t = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map_s.containsKey(c)) {
                map_s.put(c, map_s.get(c) + 1);
            } else {
                map_s.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (map_t.containsKey(c)) {
                map_t.put(c, map_t.get(c) + 1);
            } else {
                map_t.put(c, 1);
            }
        }

        if (map_s.size() == map_t.size()) {
            List<Integer> list_s = new ArrayList<Integer>(map_s.values());
            List<Integer> list_t = new ArrayList<Integer>(map_t.values());

            System.out.println(list_s);
            System.out.println(list_t);

            for (int i = 0; i < list_s.size(); i++) {
                if (!list_s.get(i).equals(list_t.get(i))) {
                    result =false;
                    break;
                }
            }
        } else {
            result = false;
        }

        return result;
    }
}
