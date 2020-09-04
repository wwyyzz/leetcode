/**
 * 709. 转换成小写字母
 * 题目描述提示帮助提交记录社区讨论阅读解答
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 *
 *
 *
 * 示例 1：
 *
 * 输入: "Hello"
 * 输出: "hello"
 * 示例 2：
 *
 * 输入: "here"
 * 输出: "here"
 * 示例 3：
 *
 * 输入: "LOVELY"
 * 输出: "lovely"
 *
 * 8 / 8 个通过测试用例
 * 状态：通过
 * 执行用时：1 ms
 */

package Question.String.Q709_pass;

/**
 * 执行用时：
 * 0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：
 * 37.3 MB, 在所有 Java 提交中击败了75.13%的用户
 */
public class Solution1 {
    public String toLowerCase(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 65 && arr[i]<= 90){
                arr[i] += 32;
            }
        }

        String s = new String(arr);


        System.out.println(s);
        return s;
    }
}
