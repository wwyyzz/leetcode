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

package Question.String.Q14_pass;

import java.util.ArrayList;
import java.util.Collections;

public class Solution1 {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder("");
        ArrayList<Integer> lens;
        lens = new ArrayList();

        for (String s:strs
             ) {
            lens.add(s.length());
        }

        int min_len = Collections.min(lens);

        for (int i = 0; i < min_len; i++) {
            if (strs[0].charAt(i) == strs[1].charAt(i) && strs[0].charAt(i) == strs[2].charAt(i)){
                sb.append(strs[0].charAt(i));
            }
        }

        System.out.println("sb =" + sb);
        return sb.toString();

    }
}
