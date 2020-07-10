/**
 * 242. 有效的字母异位词
 * 题目描述提示帮助提交记录社区讨论阅读解答
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 *
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 *
 * 34 / 34 个通过测试用例
 */
package Question.Q242;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Solution1 is not right
 */
public class Solution1 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        Set set_of_s = new HashSet();
        Set set_of_t = new HashSet();

        for (char c:s.toCharArray()
             ) {
            set_of_s.add(c);
        }
        for (char c:t.toCharArray()
                ) {
            set_of_t.add(c);
        }

        int size_s = set_of_s.size();
        int size_t = set_of_t.size();

        if (size_s != size_t){
            return false;
        }

        for (Object c:set_of_t
             ) {
            set_of_s.add(c);
        }

        if (size_s == set_of_s.size()){
            return true;
        }
        else {
            return false;
        }
    }
}

class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        System.out.println(arr1);
        System.out.println(arr2);


        if (Arrays.toString(arr1).compareTo(Arrays.toString(arr2)) == 0){
            return true;
        }else{
            return false;
        }
    }
}
