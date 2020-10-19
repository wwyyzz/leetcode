/**
 49. 字母异位词分组
 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。

 示例:

 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
 输出:
 [
 ["ate","eat","tea"],
 ["nat","tan"],
 ["bat"]
 ]
 说明：

 所有输入均为小写字母。
 不考虑答案输出的顺序。
 */

package Question.HashTable.Q49_pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 执行用时：
 7 ms, 在所有 Java 提交中击败了98.51%的用户
 内存消耗：
 41.1 MB, 在所有 Java 提交中击败了98.90%的用户
 */
public class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] arr_str = str.toCharArray();
            Arrays.sort(arr_str);
            String s = new String(arr_str);

            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(str);
        }

        System.out.println(map);
        List<List<String>> result = new ArrayList<>(map.values());

        System.out.println(result);
        return result;


    }
}
