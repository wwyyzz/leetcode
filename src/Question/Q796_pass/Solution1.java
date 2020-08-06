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

package Question.Q796_pass;

/**

 45 / 45 个通过测试用例
 状态：通过
 执行用时：1 ms
 内存消耗：37.7 MB
 */
public class Solution1 {
    public boolean rotateString(String A, String B){

        if (A.length()== 0 && B.length()==0){
            return true;
        }
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
