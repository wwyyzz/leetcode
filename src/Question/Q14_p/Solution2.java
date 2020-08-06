/**
 * 14. 最长公共前缀
 * 题目描述提示帮助提交记录社区讨论阅读解答
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 * * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 *  示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 */

package Question.Q14_p;

import java.util.Arrays;

/**
 * 118 / 118 个通过测试用例
 * 状态：通过
 * 执行用时：1 ms
 * 内存消耗：37.7 MB
 */
public class Solution2 {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length ==0) {
            return "";
        }
        int[] min_str = {0,strs[0].length()};

//        int str_len = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < min_str[1]){
                min_str[0] = i;
                min_str[1] = strs[i].length();
            }
        }

        System.out.println(Arrays.toString(min_str));
        String s = strs[0];
        int len = s.length();

        for (int i = min_str[1]; i >= 0; i--) {
            boolean flag = true;
            for (String str : strs) {
                if ((str.substring(0,i).compareTo(s.substring(0,i) )) != 0 ){
                    flag = false;
                    break;
                }
            }
            if (flag){
                len = i;
                break;
            }
        }

        System.out.println("s =" + s.substring(0,len));
        return s.substring(0,len);

    }
}
