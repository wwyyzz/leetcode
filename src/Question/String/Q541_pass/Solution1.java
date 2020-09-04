/**
 541. 反转字符串 II
 给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔 2k 个字符的前 k 个字符进行反转。

 如果剩余字符少于 k 个，则将剩余字符全部反转。
 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。

 示例:
 输入: s = "abcdefg", k = 2
 输出: "bacdfeg"

 提示：
 该字符串只包含小写英文字母。
 给定字符串的长度和 k 在 [1, 10000] 范围内。
 */

package Question.String.Q541_pass;


/**
 60 / 60 个通过测试用例
 状态：通过
 执行用时：1 ms
 内存消耗：39.6 MB
 */
public class Solution1 {
    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        String sub ;
        StringBuilder sb;

        for (int i = 0; i < s.length(); i = i + 2 * k) {
            if ( (i + 2 * k) > s.length() ){
                sub = s.substring(i);

                if (sub.length() > k){
                    sb = new StringBuilder(sub.substring(0,k));
                    result.append(sb.reverse()).append(sub.substring(k));
                } else
                {
                    sb = new StringBuilder(sub);
                    result.append(sb.reverse());
                }
            }
            else {
                sub = s.substring(i, i + 2 * k);
                System.out.println(sub);

                sb = new StringBuilder(sub.substring(0,k));
                result.append(sb.reverse()).append(sub, k, 2 * k);
            }

        }

        System.out.println(result);

        return result.toString();
    }
}
