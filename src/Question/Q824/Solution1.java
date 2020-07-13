package Question.Q824;

/**
 * @program: leetcode
 * @description: Question.Q824
 * @author: Jun Wang
 * @create: 2018-12-10 10:00
 */

import java.util.Arrays;

/**
 * 824. 山羊拉丁文
 * 给定一个由空格分割单词的句子 S。每个单词只包含大写或小写字母。
 * 我们要将句子转换为 “Goat Latin”（一种类似于 猪拉丁文 - Pig Latin 的虚构语言）。
 *
 * 山羊拉丁文的规则如下：
 * 如果单词以元音开头（a, e, i, o, u），在单词后添加"ma"。
 * 例如，单词"apple"变为"applema"。
 *
 * 如果单词以辅音字母开头（即非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
 * 例如，单词"goat"变为"oatgma"。
 *
 * 根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从1开始。
 * 例如，在第一个单词后添加"a"，在第二个单词后添加"aa"，以此类推。
 * 返回将 S 转换为山羊拉丁文后的句子。
 *
 * 示例 1:
 * 输入: "I speak Goat Latin"
 * 输出: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 *
 * 示例 2:
 * 输入: "The quick brown fox jumped over the lazy dog"
 * 输出: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 * 说明:
 *
 * S 中仅包含大小写字母和空格。单词间有且仅有一个空格。
 * 1 <= S.length <= 150。
 */

/**
 * 99 / 99 个通过测试用例
 * 状态：通过
 * 执行用时：7 ms
 *
 我的提交执行用时
 已经战胜 97.70 % 的 java 提交记录
 */
public class Solution1 {
    public String toGoatLatin(String S) {
//        使用“ ”将S拆分为单词
        String[] words = S.split(" ");
        System.out.println(Arrays.toString(words));
//        遍历单词，对每个单词执行动作（）
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {

            StringBuilder sb = new StringBuilder(words[i]);
            //        如果首字符为元音，添加ma
            //        如果为辅音，移除第一个字符并将它放到末尾，之后再添加"ma"
            if (isVowel(sb.charAt(0))) {
                sb.append("ma");
            }else {
                sb.append(sb.charAt(0)+"ma");
                sb.deleteCharAt(0);
            }
            //        在单词最后添加与索引相同数量的字母'a'
            for (int j = 0; j <= i ; j++) {
                sb.append('a');
            }

            if (i != words.length - 1){
                sb.append(" ");
            }
            result.append(sb);
        }

    // 处理后将单词合并为字符串返回

        System.out.println(result);
        return result.toString();

    }

    // 判断首字母是否是元音
    private boolean isVowel(char c){
        return  (c=='a') ||
                (c=='e') ||
                (c=='i') ||
                (c=='o') ||
                (c=='u') ||
                (c=='A') ||
                (c=='E') ||
                (c=='I') ||
                (c=='O') ||
                (c=='U') ;
    }

}
