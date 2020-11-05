/**
 402. 移掉K位数字
 给定一个以字符串表示的非负整数 num，移除这个数中的 k 位数字，使得剩下的数字最小。

 注意:
 num 的长度小于 10002 且 ≥ k。
 num 不会包含任何前导零。

 示例 1 :
 输入: num = "1432219", k = 3
 输出: "1219"
 解释: 移除掉三个数字 4, 3, 和 2 形成一个新的最小的数字 1219。

 示例 2 :
 输入: num = "10200", k = 1
 输出: "200"
 解释: 移掉首位的 1 剩下的数字为 200. 注意输出不能有任何前导零。

 示例 3 :
 输入: num = "10", k = 2
 输出: "0"
 解释: 从原数字移除所有的数字，剩余为空就是0。
 */

package Question.Greedy.Q402;

import java.util.LinkedList;

/**

 */
public class Solution1 {
    public String removeKdigits(String num, int k){
        String result = new String();


        LinkedList<Character> stack = new LinkedList<>();

        stack.push(num.charAt(0));
        for (int i = 1; i < num.length(); i++) {
            int curr = stack.peek();
            if (k > 0 && (num.charAt(i) > curr)) {
                stack.push(num.charAt(i));
            } else {
                stack.pop();
                k--;
            }
        }

        System.out.println(stack);


        return result;

    }
}
