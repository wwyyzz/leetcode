/**
 844. 比较含退格的字符串
 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。

 注意：如果对空文本输入退格字符，文本继续为空。

 示例 1：
 输入：S = "ab#c", T = "ad#c"
 输出：true
 解释：S 和 T 都会变成 “ac”。

 示例 2：
 输入：S = "ab##", T = "c#d#"
 输出：true
 解释：S 和 T 都会变成 “”。

 示例 3：
 输入：S = "a##c", T = "#a#c"
 输出：true
 解释：S 和 T 都会变成 “c”。

 示例 4：
 输入：S = "a#c", T = "b"
 输出：false
 解释：S 会变成 “c”，但 T 仍然是 “b”。

 提示：
 1 <= S.length <= 200
 1 <= T.length <= 200
 S 和 T 只含有小写字母以及字符 '#'。

 进阶：
 你可以用 O(N) 的时间复杂度和 O(1) 的空间复杂度解决该问题吗？
 */

package Question.Stack.Q844_pass;

import java.util.LinkedList;

/**
 执行用时：
 2 ms, 在所有 Java 提交中击败了74.87%的用户
 内存消耗：
 36.2 MB, 在所有 Java 提交中击败了99.88%的用户
 */
public class Solution1 {
    public boolean backspaceCompare(String S, String T){
        LinkedList<Character> stack_S = new LinkedList<>();
        LinkedList<Character> stack_T = new LinkedList<>();

        for (char c : S.toCharArray()) {
            if (c != '#') {
                stack_S.push(c);
            } else if (!stack_S.isEmpty()){
                stack_S.pop();
            }
        }

        for (char c : T.toCharArray()) {
            if (c != '#') {
                stack_T.push(c);
            } else if (!stack_T.isEmpty()){
                stack_T.pop();
            }
        }

        System.out.println(stack_S);
        System.out.println(stack_T);

        return stack_S.equals(stack_T);

    }
}
