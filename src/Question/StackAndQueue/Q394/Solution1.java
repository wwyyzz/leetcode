/**
 394. 字符串解码
 给定一个经过编码的字符串，返回它解码后的字符串。
 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。

 示例 1：
 输入：s = "3[a]2[bc]"
 输出："aaabcbc"

 示例 2：
 输入：s = "3[a2[c]]"
 输出："accaccacc"

 示例 3：
 输入：s = "2[abc]3[cd]ef"
 输出："abcabccdcdcdef"

 示例 4：
 输入：s = "abc3[cd]xyz"
 输出："abccdcdcdxyz"
 */

package Question.StackAndQueue.Q394;

import java.util.LinkedList;

/**

 */
public class Solution1 {
    public String decodeString(String s){
        StringBuilder result = new StringBuilder();
        LinkedList<Character> stack = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (c != ']') {
                stack.push(c);
            } else {
                StringBuilder sb = new StringBuilder();
                StringBuilder counts = new StringBuilder();
                char ch = stack.pop();
                while (ch >= 'a' && ch <= 'z') {
                    sb.insert(0,ch);
                    if (stack.isEmpty()) {
                        break;
                    }
                    ch = stack.pop();
                }
                ch = stack.pop();
                while (ch >= '0' && ch <= '9') {
                    counts.insert(0,ch);
                    if (stack.isEmpty()) {
                        break;
                    }
                    ch = stack.pop();

                }
                if (ch >= 'a' && ch <= 'z') {
                    stack.push(ch);
                }

                StringBuilder repeat_string = new StringBuilder();
                for (int i = 0; i < Integer.parseInt(counts.toString()); i++) {
                    repeat_string.append(sb);
                }

                for (char c1 : repeat_string.toString().toCharArray()) {
                    stack.push(c1);
                }
            }
        }

        for (Character character : stack) {
            result.insert(0,character);
        }
        System.out.println(result);

        return result.toString();

    }
}
