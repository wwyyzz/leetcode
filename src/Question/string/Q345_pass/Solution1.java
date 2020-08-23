package Question.string.Q345_pass;

/**
 * @program: leetcode
 * @description: Question.Q345
 * @author: Jun Wang
 * @create: 2018-12-06 17:10
 */

/**
 * 345. 反转字符串中的元音字母
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * <p>
 * 示例 1:
 * 输入: "hello"
 * 输出: "holle"
 * <p>
 * 示例 2:
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 说明:
 * 元音字母不包含字母"y"。
 */

/**
 * 481 / 481 个通过测试用例
 * 状态：通过
 * 执行用时：8 ms
 *
 * 我的提交执行用时
 * 已经战胜 57.38 % 的 java 提交记录
 */
public class Solution1 {
    public String reverseVowels(String s) {
//        将String 转为char[]
//        从两头遍历char[]，将碰到的元音进行交换
        char[] sToArray = s.toCharArray();

        for (int i = 0, j = sToArray.length - 1; i < j; ) {
            System.out.println(sToArray[i]);
            if (!isVowel(sToArray[i])) {
                i++;
                continue;
            }
            if (!isVowel(sToArray[j])) {
                j--;
                continue;
            }
            char temp;
            temp = sToArray[i];
            sToArray[i] = sToArray[j];
            sToArray[j] = temp;
            System.out.println(temp);
            i++;
            j--;
        }

        System.out.println(sToArray);
        return new String(sToArray);

    }

    private Boolean isVowel(char c) {
        return  c == 'a' ||
                c == 'e' ||
                c == 'i' ||
                c == 'o' ||
                c == 'u' ||
                c == 'A' ||
                c == 'E' ||
                c == 'I' ||
                c == 'O' ||
                c == 'U';
    }
}
