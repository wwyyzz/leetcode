/**
 5519. 重新排列单词间的空格 显示英文描述
 通过的用户数0
 尝试过的用户数0
 用户总通过次数0
 用户总提交次数0
 题目难度Easy
 给你一个字符串 text ，该字符串由若干被空格包围的单词组成。每个单词由一个或者多个小写英文字母组成，并且两个单词之间至少存在一个空格。题目测试用例保证 text 至少包含一个单词 。

 请你重新排列空格，使每对相邻单词之间的空格数目都 相等 ，并尽可能 最大化 该数目。如果不能重新平均分配所有空格，请 将多余的空格放置在字符串末尾 ，这也意味着返回的字符串应当与原 text 字符串的长度相等。

 返回 重新排列空格后的字符串 。



 示例 1：

 输入：text = "  this   is  a sentence "
 输出："this   is   a   sentence"
 解释：总共有 9 个空格和 4 个单词。可以将 9 个空格平均分配到相邻单词之间，相邻单词间空格数为：9 / (4-1) = 3 个。
 示例 2：

 输入：text = " practice   makes   perfect"
 输出："practice   makes   perfect "
 解释：总共有 7 个空格和 3 个单词。7 / (3-1) = 3 个空格加上 1 个多余的空格。多余的空格需要放在字符串的末尾。
 示例 3：

 输入：text = "hello   world"
 输出："hello   world"
 示例 4：

 输入：text = "  walks  udp package   into  bar a"
 输出："walks  udp  package  into  bar  a "
 示例 5：

 输入：text = "a"
 输出："a"


 提示：

 1 <= text.length <= 100
 text 由小写英文字母和 ' ' 组成
 text 中至少包含一个单词
 */

package Contest.W207.Q5519_pass;

import java.util.Arrays;

/**
 88 / 88 个通过测试用例
 状态：通过
 执行用时: 5 ms
 内存消耗: 37.4 MB

 */
public class Solution1 {
    public String reorderSpaces(String text) {
        String result = new String();

        String text_trim = text.trim();
        String[] text_arr = text_trim.split("\\s+");

        int word_nums = text_arr.length;
        int letter_nums = 0;
        System.out.println(Arrays.toString(text_arr));
        for (int i = 0; i < word_nums ; i++) {
            letter_nums += text_arr[i].length();
            System.out.println(text_arr[i]);
        }

        int space_nums = text.length() - letter_nums;

        if (space_nums == 0) {
            return text;
        }
        int space = 0;

        if (word_nums == 1) {
            space = space_nums;
        } else {
            space =  space_nums / (word_nums - 1);
        }


        System.out.println("space_nums :" + space_nums);
        System.out.println("space      :" + space);

        String string_space = new String();
        for (int i = 0; i < space; i++) {
            string_space +=" ";
        }

        System.out.println(string_space);

        for (int i = 0; i < word_nums - 1; i++) {
            result += text_arr[i].concat(string_space);
        }

        result += text_arr[word_nums - 1];

        System.out.println(result);

        int diff = text.length() - result.length();
        String string_space_suffix = new String();
        for (int i = 0; i < diff; i++) {
            string_space_suffix +=" ";
        }

        result += string_space_suffix;
        System.out.println("result  :" + result);
        return result;

    }
}
