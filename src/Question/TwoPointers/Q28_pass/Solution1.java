/**
 * 28. 实现strStr()
 * 题目描述提示帮助提交记录社区讨论阅读解答
 * 实现 strStr() 函数。
 * * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 *
 * 示例 2:
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 * 说明:
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符
 *
 * 74 / 74 个通过测试用例
 * 状态：通过
 * 执行用时：4 ms
 *
 * 我的提交执行用时
 * 已经战胜 99.46 % 的 java 提交记录
 */

package Question.TwoPointers.Q28_pass;

/**
 *
 77 / 77 个通过测试用例
 状态：通过
 执行用时：1 ms
 内存消耗：40.2 MB
 */
public class Solution1 {
    public int strStr(String haystack, String needle) {
        int step = needle.length();

//        if (step == 0){
//            return 0;
//        }
        for (int i = 0; i < haystack.length() - step + 1; i++) {
            String s = haystack.substring(i, i+step);
            System.out.println("s =" + s);
            if (s.compareTo(needle) == 0){
                return i;
            }
            
        }
        return -1;
    }

}
