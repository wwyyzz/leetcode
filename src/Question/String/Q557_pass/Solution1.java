package Question.String.Q557_pass;

/**
 * @program: leetcode
 * @description: Question.Q557
 * @author: Jun Wang
 * @create: 2018-12-10 11:01
 */

/**
 * 557. 反转字符串中的单词 III
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 示例 1:
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 *
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */

/**
 *
 30 / 30 个通过测试用例
 状态：通过
 执行用时：8 ms

 已经战胜 94.14 % 的 java 提交记录
 */
public class Solution1 {
    public String reverseWords(String s) {
//        使用“ ”将S拆分为单词
        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();

//        遍历单词，对每个单词执行动作（）
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
//                反转单词
//                追加到结果字符串
            sb.reverse();
            if (i != words.length - 1){
                sb.append(" ");
            }
            result.append(sb);
        }

        System.out.println(result);
        return result.toString();
    }
}
