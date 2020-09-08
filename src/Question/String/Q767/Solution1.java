/**
 767. 重构字符串
 给定一个字符串S，检查是否能重新排布其中的字母，使得两相邻的字符不同。

 若可行，输出任意可行的结果。若不可行，返回空字符串。

 示例 1:

 输入: S = "aab"
 输出: "aba"
 示例 2:

 输入: S = "aaab"
 输出: ""
 注意:

 S 只包含小写字母并且长度在[1, 500]区间内。
 */

package Question.String.Q767;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**

 */
public class Solution1 {
    public String reorganizeString(String S){
        String result = new String();
        StringBuilder sb = new StringBuilder();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : S.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();

        int max = 0;
        Map.Entry<Character, Integer> max_letter = null;
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                max_letter = entry;
            }
        }

        System.out.println(max_letter.getKey());

        System.out.println(map);

        if ((S.length() - max) < (max - 1)) {
            return "";
        }



        return result;

    }
}
