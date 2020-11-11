/**
 344. 反转字符串
 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。

 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。

 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。

 示例 1：

 输入：["h","e","l","l","o"]
 输出：["o","l","l","e","h"]

 示例 2：
 输入：["H","a","n","n","a","h"]
 输出：["h","a","n","n","a","H"]
 */

package Question.SlidingWindowAndTwoPointers.Q344_2_pass;


import java.util.Arrays;

/**

 478 / 478 个通过测试用例
 状态：通过
 执行用时：1 ms
 内存消耗：46.4 MB
 */
public class Solution1 {
    public void reverseString(char[] s) {
        char tmp = 0;
        for (int i = 0; i < s.length / 2; i++) {
            System.out.println(s[i]);
            tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp ;
        }

        System.out.println(Arrays.toString(s));
    }
}
