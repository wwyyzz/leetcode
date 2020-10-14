/**
 1002. 查找常用字符
 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。

 你可以按任意顺序返回答案。

 示例 1：
 输入：["bella","label","roller"]
 输出：["e","l","l"]

 示例 2：
 输入：["cool","lock","cook"]
 输出：["c","o"]

 提示：
 1 <= A.length <= 100
 1 <= A[i].length <= 100
 A[i][j] 是小写字母
 */

package Question.HashTable.Q1002;

import java.util.ArrayList;
import java.util.List;

/**
 执行用时：
 36 ms, 在所有 Java 提交中击败了5.62%的用户
 内存消耗：
 39.5 MB, 在所有 Java 提交中击败了9.84%的用户
 */
public class Solution1 {
    public List<String> commonChars(String[] A){
        List<String> result = new ArrayList<>();
        char[] arr = A[0].toCharArray();

        for (char c : arr) {
            boolean flag = true;
            for (int i = 1; i < A.length; i++) {
                if (!A[i].contains("" + c)) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                String match = "" + c;
                result.add(match);
                for (int i = 1; i < A.length; i++) {
                    A[i] = A[i].replaceFirst(match, "");
                }
            }
        }

        System.out.println(result);

        return result;
    }
}
