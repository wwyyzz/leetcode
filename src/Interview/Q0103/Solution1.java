/**
 面试题 01.03. URL化
 URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。（
 注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）

 示例1:
 输入："Mr John Smith    ", 13
 输出："Mr%20John%20Smith"

 示例2:
 输入："               ", 5
 输出："%20%20%20%20%20"

 提示：
 字符串长度在[0, 500000]范围内。
 */

package Interview.Q0103;

import java.util.Arrays;

/**

 */
public class Solution1 {
    public String replaceSpaces(String S, int length){


        char[] chars = S.toCharArray();
        char[] dest = new char[S.length()];

        int i = 0;
        int j = 0;
        while (j < S.length()) {
            if (chars[i] != ' ') {
                dest[j] = chars[i];
                i++;
                j++;
            } else {
                i++;
                dest[j] = '%';
                dest[j + 1] = '2';
                dest[j + 2] = '0';
                j += 3;
            }
        }

        System.out.println(Arrays.toString(dest));

        String result = new String(dest);
        System.out.println(result);
        return result;

    }
}
