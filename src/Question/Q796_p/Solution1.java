/**
 796. 旋转字符串
 给定两个字符串, A 和 B。

 A 的旋转操作就是将 A 最左边的字符移动到最右边。 例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea' 。如果在若干次旋转操作之后，A 能变成B，那么返回True。

 示例 1:
 输入: A = 'abcde', B = 'cdeab'
 输出: true

 示例 2:
 输入: A = 'abcde', B = 'abced'
 输出: false
 注意：

 A 和 B 长度不超过 100。
 */

package Question.Q796_p;

/**

 */
public class Solution1 {
    public boolean rotateString(String A, String B){
        boolean result = false;

        StringBuilder sb_A = new StringBuilder(A);

        for (int i = 0; i < A.length() ; i++) {
            char c = sb_A.charAt(0);
            sb_A.deleteCharAt(0);
            sb_A.append(c);

            if (sb_A.toString().compareTo(B) == 0){
                result = true;
                return result;
            }
        }

        return result;

    }
}
