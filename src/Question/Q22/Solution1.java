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

package Question.Q22;

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
                queue.push(tmp.append("("));
                queue.push(tmp.append(")"));

            }

            level++;
        }

        System.out.println(queue);

        return result;

    }
}
