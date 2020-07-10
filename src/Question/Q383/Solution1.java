package Question.Q383;

/**
 * @program: leetcode
 * @description: Question.Q383
 * @author: Jun Wang
 * @create: 2018-12-10 11:19
 */

/**
 * 383. 赎金信
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
 *
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
 *
 * 注意：
 * 你可以假设两个字符串均只含有小写字母。
 *
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 */

/**
 * 126 / 126 个通过测试用例
 * 状态：通过
 * 执行用时：21 ms
 *
 * 已经战胜 69.76 % 的 java 提交记录
 */
public class Solution1 {
    public boolean canConstruct(String ransomNote, String magazine) {
//        遍历ransom中的每一个字符
        StringBuilder sb = new StringBuilder(magazine);
        for (char c :ransomNote.toCharArray()
             ) {
            //        如果该字符在magazine中，则continue；
            //        否则返回false
            System.out.println(c);
            System.out.println(magazine.indexOf(c));
            if (sb.indexOf(""+c) == -1){
                return false;
            }
            //对于magazine中已经使用过的字符，需要删除，不能重复使用
            sb.deleteCharAt(sb.indexOf("" + c));
        }

//        遍历完以后返回 true

        return true;
    }
}
