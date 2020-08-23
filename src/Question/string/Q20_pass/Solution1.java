/**
 20. 有效的括号
 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

 有效字符串需满足：

 左括号必须用相同类型的右括号闭合。
 左括号必须以正确的顺序闭合。
 注意空字符串可被认为是有效字符串。

 示例 1:
 输入: "()"
 输出: true

 示例 2:
 输入: "()[]{}"
 输出: true

 示例 3:
 输入: "(]"
 输出: false

 示例 4:
 输入: "([)]"
 输出: false

 示例 5:
 输入: "{[]}"
 输出: true
 */

package Question.string.Q20_pass;

import java.util.LinkedList;

/**

 */
public class Solution1 {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();

        LinkedList<Character> stack = new LinkedList();

//        stack.add(chars[chars.length -1]);
        for (int i = chars.length - 1; i >= 0; i--) {
            if (stack.isEmpty()){
                stack.push(chars[i]);
                continue;
            }
            if (    (chars[i] =='(' && stack.peek() == ')') ||
                    (chars[i] =='[' && stack.peek() == ']') ||
                    (chars[i] =='{' && stack.peek() == '}') ){
                stack.pop();
            }else {
                stack.push(chars[i]);
            }
            System.out.println(stack);
        }

        return stack.isEmpty();
    }
}
