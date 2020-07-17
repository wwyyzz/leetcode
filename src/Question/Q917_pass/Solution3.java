/**
 917. 仅仅反转字母
 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。

 示例 1：
 输入："ab-cd"
 输出："dc-ba"

 示例 2：
 输入："a-bC-dEf-ghIj"
 输出："j-Ih-gfE-dCba"

 示例 3：
 输入："Test1ng-Leet=code-Q!"
 输出："Qedo1ct-eeLg=ntse-T!"

 提示：

 S.length <= 100
 33 <= S[i].ASCIIcode <= 122
 S 中不包含 \ or "
 */

package Question.Q917_pass;


import java.util.LinkedList;


/**

 */
public class Solution3 {
    public String reverseOnlyLetters(String S) {

//        LinkedList 和 Stack 可以实现相同的功能，推荐使用Linkedlist
//        Stack<Character> s = new Stack<>();
        LinkedList<Character> s = new LinkedList<>();

        for (int i = 0; i < S.length() ; i++) {
            if (isLetter(S.charAt(i))){
                s.push(S.charAt(i));
            }
        }

        System.out.println(S);
        System.out.println(s);

        StringBuilder sb = new StringBuilder(S);
        for (int i = 0; i < sb.length() ; i++) {
            if (isLetter(sb.charAt(i))){
                sb.setCharAt(i, s.pop());
            }
        }

        System.out.println(sb.toString());
        return sb.toString();
    }

    private boolean isLetter(char c){

        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }
}
