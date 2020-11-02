/**
 504. 七进制数
 给定一个整数，将其转化为7进制，并以字符串形式输出。

 示例 1:
 输入: 100
 输出: "202"

 示例 2:
 输入: -7
 输出: "-10"
 注意: 输入范围是 [-1e7, 1e7] 。
 */

package Question.Q504_pass;

/**
 执行用时：
 8 ms, 在所有 Java 提交中击败了10.85%的用户
 内存消耗：
 35.9 MB, 在所有 Java 提交中击败了90.42%的用户
 */
public class Solution1 {
    public String convertToBase7(int num){
        if (num == 0) {
            return "0";
        }
        String result = new String();
        int n = num;
        StringBuilder sb = new StringBuilder();
        if (num < 0) {
             num = -num;
        }
        int reminder = 0;
        while (num > 0) {
            reminder = num % 7 ;
            sb.append(""+ reminder);
            num = num / 7 ;
        }
        System.out.println(sb);
        if (n < 0) {
            sb.reverse().insert(0, "-");
        } else {
            sb.reverse();
        }
        return sb.toString();

    }
}
