/**
 * 344. 反转字符串
 *         题目描述提示帮助提交记录社区讨论阅读解答
 *         编写一个函数，其作用是将输入的字符串反转过来。
 *
 *         示例 1:
 *
 *         输入: "hello"
 *         输出: "olleh"
 *         示例 2:
 *
 *         输入: "A man, a plan, a canal: Panama"
 *         输出: "amanaP :lanac a ,nalp a ,nam A"
 */


package Q344;

public class Solution1 {
}

class s1 {
    public String reverseString(String s) {
        String result ="";
        for (int i = s.length() -1; i >= 0; i--) {
            result +=s.charAt(i);
        }

//        System.out.println(result);
        return result;
    }
}

/**
 * 476 / 476 个通过测试用例
 * 状态：通过
 * 执行用时：4 ms
 */
class s2 {
    public String reverseString(String s) {

        StringBuilder sb = new StringBuilder(s);
        String result = new String(sb.reverse());

        return result;
    }
}