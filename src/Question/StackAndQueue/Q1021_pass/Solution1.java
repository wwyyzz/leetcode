/**
 1021. 删除最外层的括号
 有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A 和 B 都是有效的括号字符串，+ 代表字符串的连接。例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。
 如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），其中 A 和 B 都是非空有效括号字符串。
 给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，其中 P_i 是有效括号字符串原语。
 对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S 。

 示例 1：
 输入："(()())(())"
 输出："()()()"
 解释：
 输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
 删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。

 示例 2：
 输入："(()())(())(()(()))"
 输出："()()()()(())"
 解释：
 输入字符串为 "(()())(())(()(()))"，原语化分解得到 "(()())" + "(())" + "(()(()))"，
 删除每个部分中的最外层括号后得到 "()()" + "()" + "()(())" = "()()()()(())"。

 示例 3：
 输入："()()"
 输出：""
 解释：
 输入字符串为 "()()"，原语化分解得到 "()" + "()"，
 删除每个部分中的最外层括号后得到 "" + "" = ""。


 提示：

 S.length <= 10000
 S[i] 为 "(" 或 ")"
 S 是一个有效括号字符串
 */

package Question.StackAndQueue.Q1021_pass;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 执行用时：
 15 ms
 , 在所有 Java 提交中击败了
 13.38%
 的用户
 内存消耗：
 40 MB
 , 在所有 Java 提交中击败了
 27.56%
 的用户
 */
public class Solution1 {
    public String removeOuterParentheses(String S) {

        StringBuilder result= new StringBuilder();

        LinkedList<Character> stack = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        ArrayList<StringBuilder> list = new ArrayList<>();
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                stack.pop();
            }
            sb.append(c);
            if (stack.isEmpty()) {
                System.out.println(sb);
                list.add(sb);
                sb = new StringBuilder();
            }
        }

        for (StringBuilder primitive : list) {
            String sub = primitive.substring(1,primitive.length() - 1);
            System.out.println("subString  :" + sub);
            result.append(sub);
        }

        return result.toString();

    }
}
