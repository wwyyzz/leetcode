/**
 * 242. 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
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
 */
package Question.Q242_pass;

import java.util.Arrays;

/**
 * 34 / 34 个通过测试用例
 * 状态：通过
 * 执行用时：13 ms
 * 内存消耗：40.5 MB
 */
public class Solution2 {
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
