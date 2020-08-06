/**
 859. 亲密字符串
 给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。

 示例 1：

 输入： A = "ab", B = "ba"
 输出： true
 示例 2：

 输入： A = "ab", B = "ab"
 输出： false
 示例 3:

 输入： A = "aa", B = "aa"
 输出： true
 示例 4：

 输入： A = "aaaaaaabc", B = "aaaaaaacb"
 输出： true
 示例 5：

 输入： A = "", B = "aa"
 输出： false

 提示：

 0 <= A.length <= 20000
 0 <= B.length <= 20000
 A 和 B 仅由小写字母构成。
 */

package Question.Q859_pass;


/**
 27 / 29 个通过测试用例
 状态：超出时间限制
 */
public class Solution1 {
    public boolean buddyStrings(String A, String B){
        boolean result = false;

        if (A.length() != B.length()) {
            return false;
        }

//        char[] A_arr = A.toCharArray();

        StringBuilder sb_A = new StringBuilder(A);

        System.out.println(A);
        System.out.println(sb_A);

        StringBuilder temp = sb_A;

        for (int i = 0; i < sb_A.length() - 1; i++) {
            for (int j = i + 1; j < A.length(); j++) {
                sb_A = new StringBuilder(A);
                char c = sb_A.charAt(j);
                sb_A.setCharAt(j, sb_A.charAt(i));
                sb_A.setCharAt(i, c);

                if (sb_A.toString().compareTo(B) == 0){
                    result = true;
                    return result;
                }

            }
        }


        return result;

    }
}
