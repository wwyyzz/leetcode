/**
 451. 根据字符出现频率排序
 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。

 示例 1:
 输入:
 "tree"
 输出:
 "eert"
 解释:
 'e'出现两次，'r'和't'都只出现一次。
 因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。

 示例 2:
 输入:
 "cccaaa"
 输出:
 "cccaaa"
 解释:
 'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
 注意"cacaca"是不正确的，因为相同的字母必须放在一起。

 示例 3:
 输入:
 "Aabb"
 输出:
 "bbAa"
 解释:
 此外，"bbaA"也是一个有效的答案，但"Aabb"是不正确的。
 注意'A'和'a'被认为是两种不同的字符。
 */

package Question.HashTable.Q451_pass;

import java.util.*;

/**
 执行用时：
 24 ms, 在所有 Java 提交中击败了35.54%的用户
 内存消耗：
 39.7 MB, 在所有 Java 提交中击败了71.58%的用户
 */
public class Solution1 {
    public String frequencySort(String s){

        HashMap<Character,Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
//        Collections.sort(entries, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        entries.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entries) {
            for (Integer i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }

//        System.out.println(sb);
        return sb.toString();

    }
}
