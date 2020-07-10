/**
 * 409. 最长回文串
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 *
 * 注意:
 * 假设字符串的长度不会超过 1010。
 *
 * 示例 1:
 * 输入:
 * "abccccdd"
 * 输出:
 * 7
 *
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 */

package Question.Q409;

import java.util.HashMap;
import java.util.Map;

/**
 *
 95 / 95 个通过测试用例
 状态：通过
 执行用时：13 ms
 已经战胜 52.68 % 的 java 提交记录
 */
public class Solution1 {
    public int longestPalindrome(String s) {
//        定义HashMap
        Map<Character, Integer> letters = new HashMap();
//        遍历字符串
        for (char c:s.toCharArray()
             ) {
//          如果已经包含，则value + 1
//          否则 put 到HashMap中
            if (letters.containsKey(c)){
                letters.put(c, letters.get(c) + 1);
            }else {
                letters.put(c, 1);
            }
        }
        System.out.println(letters);
//         统计value的值
        int result = 0;
        int flag = 0;
//              如果为偶数则累加到result
//              如果为奇数，-1后累加到result中
        for (int i : letters.values()
             ) {
            if ( i % 2 == 0){
                result += i;
            }else{
                result = result + i -1;
                flag = 1;
            }
        }

        if (letters.size() == 1)  {
            return s.length();
        }
        return result + flag;
    }

}
