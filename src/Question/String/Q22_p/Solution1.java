/**
 22. 括号生成
 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。

 示例：
 输入：n = 3
 输出：[
 "((()))",
 "(()())",
 "(())()",
 "()(())",
 "()()()"
 ]
 */

package Question.String.Q22_p;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**

 */
public class Solution1 {
    public List<String> generateParenthesis(int n){
        ArrayList result = new ArrayList();

        LinkedList<StringBuilder> queue = new LinkedList();
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        queue.push(sb);

        int level = 1;
        while ( level < 2 * n ) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                StringBuilder tmp = queue.poll();
                StringBuilder add_left = new StringBuilder(tmp).append("(");
                StringBuilder add_right = new StringBuilder(tmp).append(")");

                if (countParenthesis(add_left.toString())[0] <= 3) {
                    queue.add(add_left);
                }
                if (countParenthesis(add_right.toString())[1] <= 3 &&
                        (countParenthesis(add_right.toString())[1] <= countParenthesis(add_right.toString())[0])) {
                    queue.add(add_right);
                }

            }

            level++;
        }

        System.out.println(queue);

        for (StringBuilder stringBuilder : queue) {
            result.add(stringBuilder.toString());
        }
        return result;

    }

    private int[] countParenthesis(String s) {
        int[] count = {0, 0};
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count[0]++;
            } else {
                count[1]++;
            }
        }

        return count;
    }
}
