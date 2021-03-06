/**
 17. 电话号码的字母组合
 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。

 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。

 示例:
 输入："23"
 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

 说明:
 尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
 */

package Question.HashTable.Q17_pass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 执行用时：
 5 ms, 在所有 Java 提交中击败了31.76%的用户
 内存消耗：
 38.3 MB, 在所有 Java 提交中击败了34.98%的用户
 */
public class Solution1 {
    public List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        LinkedList<StringBuilder> queue = new LinkedList<>();
        for (char c : map.get(digits.charAt(0)).toCharArray()) {
            queue.add(new StringBuilder(c + ""));
        }
        System.out.println(queue);
        int len = digits.length();
        for (int i = 1; i < len; i++) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                StringBuilder sb = queue.poll();
                for (char c : map.get(digits.charAt(i)).toCharArray()) {
                    queue.offer(new StringBuilder(sb).append(c));
                }
            }
        }
        System.out.println(queue);

        for (StringBuilder stringBuilder : queue) {
            result.add(stringBuilder.toString());
        }
        return result;

    }
}
