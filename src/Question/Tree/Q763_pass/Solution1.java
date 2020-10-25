/**
 763. 划分字母区间
 字符串 S 由小写字母组成。
 我们要把这个字符串划分为尽可能多的片段，同一个字母只会出现在其中的一个片段。返回一个表示每个字符串片段的长度的列表。

 示例 1：
 输入：S = "ababcbacadefegdehijhklij"
 输出：[9,7,8]
 解释：
 划分结果为 "ababcbaca", "defegde", "hijhklij"。
 每个字母最多出现在一个片段中。
 像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。

 提示：
 S的长度在[1, 500]之间。
 S只包含小写字母 'a' 到 'z' 。
 */

package Question.Tree.Q763_pass;

import java.util.ArrayList;
import java.util.List;

/**
 116 / 116 个通过测试用例
 状态：通过
 执行用时: 10 ms
 内存消耗: 37.1 MB

 */
public class Solution1 {
    public List<Integer> partitionLabels(String S){
        List<Integer> result = new ArrayList<>();

        int start = 0;
        int end = S.lastIndexOf(S.charAt(start));

        while (end < (S.length())) {
            for (int i = start; i < end; i++) {
                int last = S.lastIndexOf(S.charAt(i));
                if (last > end) {
                    end = last;
                }
            }
            System.out.println(S.substring(start, end));
            result.add(end - start + 1);
            start = end + 1;
            if (start >= S.length()) {
                break;
            }
            end = S.lastIndexOf(S.charAt(start));
        }

        System.out.println(result);
        return  result;

}
}
