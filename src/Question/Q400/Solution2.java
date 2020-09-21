package Question.Q400;

/**
 * @program: leetcode
 * @description: Question.Q400
 * @author: Jun Wang
 * @create: 2018-12-17 15:37
 */

/**
 * 400. 第N个数字
 * 在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 个数字。
 *
 * 注意:
 * n 是正数且在32为整形范围内 ( n < 231)。
 *
 * 示例 1:
 * 输入:
 * 3
 * 输出:
 * 3
 *
 * 示例 2:
 * 输入:
 * 11
 * 输出:
 * 0
 *
 * 说明:
 * 第11个数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是0，它是10的一部分。
 */

import java.util.ArrayList;

/**
 * 暴力法 对于 100000000 测试不通过
 */
public class Solution2 {
    public int findNthDigit(int n) {
        ArrayList<Character> list = new ArrayList();

        int num = 0;
        while (list.size() <= n) {
            for (char c : Integer.toString(num).toCharArray()) {
                list.add(c);
            }
            num++;
        }

        System.out.println(list.get(n));
        return list.get(n) - 48;
    }
}
