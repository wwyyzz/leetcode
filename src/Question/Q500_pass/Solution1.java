/**
 500. 键盘行
 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。

 American keyboard

 示例：
 输入: ["Hello", "Alaska", "Dad", "Peace"]
 输出: ["Alaska", "Dad"]

 注意：
 你可以重复使用键盘上同一字符。
 你可以假设输入的字符串将只包含字母。
 */

package Question.Q500_pass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 执行用时：
 1 ms, 在所有 Java 提交中击败了48.69%的用户
 内存消耗：
 36.6 MB, 在所有 Java 提交中击败了54.38%的用户
 */
public class Solution1 {
    public String[] findWords(String[] words){
        ArrayList<String> list = new ArrayList<>();

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 2);
        map.put('b', 3);
        map.put('c', 3);
        map.put('d', 2);
        map.put('e', 1);
        map.put('f', 2);
        map.put('g', 2);
        map.put('h', 2);
        map.put('i', 1);
        map.put('j', 2);
        map.put('k', 2);
        map.put('l', 2);
        map.put('m', 3);
        map.put('n', 3);
        map.put('o', 1);
        map.put('p', 1);
        map.put('q', 1);
        map.put('r', 1);
        map.put('s', 2);
        map.put('t', 1);
        map.put('u', 1);
        map.put('v', 3);
        map.put('w', 1);
        map.put('x', 3);
        map.put('y', 1);
        map.put('z', 3);

        for (String word : words) {
            HashSet<Integer> set = new HashSet<>();
            for (char c : word.toLowerCase().toCharArray()) {
                set.add(map.get(c));
            }

            if (set.size() == 1) {
                list.add(word);
            }
        }

        System.out.println(list);

        String[] result = new String[list.size()];
        list.toArray(result);

        return result;
    }
}
