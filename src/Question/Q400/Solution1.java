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

/**
 * 暴力法 对于 100000000 测试不通过
 */
public class Solution1 {
    public int findNthDigit(int n) {
//        创建变量count用于统计数字数量
        StringBuilder sb = new StringBuilder();
        int num = 1;
//        while（count < n ）
        while (sb.length() < n){
            //        从1开始到递增，将数转为String添加到StringBuilder中
            sb.append(Integer.toString(num));
            num++;
        }
//        从1开始到递增，将数转为String添加到StringBuilder中
//                返回第n个数字
        System.out.println(sb);
        return sb.charAt(n - 1) - 48;
    }
}
