/**
 459. 重复的子字符串
 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。

 示例 1:
 输入: "abab"
 输出: True
 解释: 可由子字符串 "ab" 重复两次构成。

 示例 2:
 输入: "aba"
 输出: False

 示例 3:
 输入: "abcabcabcabc"
 输出: True
 解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
 */

package Question.string.Q459_pass;

/**
 执行用时：
 10 ms, 在所有 Java 提交中击败了89.73%的用户
 内存消耗：
 40.3 MB, 在所有 Java 提交中击败了40.98%的用户
 */
public class Solution1 {
    public boolean repeatedSubstringPattern(String s){
        boolean result = true;

        int len = s.length();
        for (int i = 1; i <= len / 2; i++) {
            result = true;
            int step = len % i ;
            if (step == 0) {
                String s_sub= s.substring(0, i);
                System.out.println(s_sub);
                for (int j = 0; j < s.length() / i; j++) {
                    System.out.println("s_sub :" + s.substring(j * i, j * i + i));
                    if (s_sub.compareTo(s.substring(j * i, j * i + i)) != 0) {
                        result = false;
                        break;
                    }
                }
                if (result == true) {
                    return result;
                }
            }
        }

        return false;

    }
}
