/**

 */

package Question.String.Q344_pass;

/**
 * 476 / 476 个通过测试用例
 * 状态：通过
 * 执行用时：4 ms
 */
public class Solution2 {
    public String reverseString(String s) {

        StringBuilder sb = new StringBuilder(s);

        return new String(sb.reverse());
    }
}
