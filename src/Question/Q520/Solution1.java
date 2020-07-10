package Question.Q520;

/**
 * @program: leetcode
 * @description: Question.Q520
 * @author: Jun Wang
 * @create: 2018-12-06 15:50
 *
 * 520. 检测大写字母
 * 给定一个单词，你需要判断单词的大写使用是否正确。
 *
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 *
 * 全部字母都是大写，比如"USA"。
 * 单词中所有字母都不是大写，比如"leetcode"。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 *
 * 示例 1:
 * 输入: "USA"
 * 输出: True
 *
 * 示例 2:
 * 输入: "FlaG"
 * 输出: False
 * 注意: 输入是由大写和小写拉丁字母组成的非空单词。
 */

/**
 *
 550 / 550 个通过测试用例
 状态：通过
 执行用时：20 ms

 我的提交执行用时
 已经战胜 93.20 % 的 java 提交记录
 */
public class Solution1 {
    public boolean detectCapitalUse(String word) {

        char firstLetter = word.charAt(0);
//        判断String的首字符：
//        如果为大写：
        String sub = new String(word.substring(1));
        String upperCase = new String(word.substring(1).toUpperCase());
        String lowerCase = new String(word.substring(1).toLowerCase());
        System.out.println("sub =" + sub);
        System.out.println("sub =" + upperCase);
        System.out.println("sub =" + lowerCase);

//        将子字符串【1，length】分别转为大写和小写，如和原来的字符相等则为true
//        如果为小写：
//        将字符串转为小写，如相等则true
        if (firstLetter >= 'A' && firstLetter <= 'Z'){
            return (sub.compareTo(upperCase) == 0 || sub.compareTo(lowerCase) == 0) ? (true):(false);
        }else {
            return (sub.compareTo(lowerCase) == 0 ) ? (true):(false);

        }

    }
}
