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

package Question.Q917;


/**

 */
public class Solution1 {
    public String reverseOnlyLetters(String S) {
        char[] c = S.toCharArray();

        for (int i = 0, j = c.length - 1; i < c.length / 2 && j > c.length / 2  ; i++,j--) {
            System.out.println(c[i] + "  "  + c[j]);
            if (isLetter(c[i]) ){
                if (isLetter(c[j])){

                }
            }
        }

        return S;
    }

    private boolean isLetter(char c){

        return ((c >= 65 && c <= 90) || (c >= 96 && c<= 122) ) ? true:false;
    }
}
