package Question.Q832_pass;

/**
 * @program: leetcode
 * @description: Question.Q832
 * @author: Jun Wang
 * @create: 2018-12-06 14:03
 *
 * 832. 翻转图像
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 *
 * 示例 1:
 * 输入: [[1,1,0],[1,0,1],[0,0,0]]
 * 输出: [[1,0,0],[0,1,0],[1,1,1]]
 * 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
 *      然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
 *
 * 示例 2:
 * 输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * 输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
 *      然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 *
 * 说明:
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 */

/**
 *
 82 / 82 个通过测试用例
 状态：通过
 执行用时：8 ms

 我的提交执行用时
 已经战胜 59.26 % 的 java 提交记录
 */
public class Solution1 {
    public int[][] flipAndInvertImage(int[][] A) {

        for (int i = 0; i < A.length; i++) {
//            第一次双层for遍历一半的元素
//                    借助中间变量x实现首尾交换

            for (int j = 0; j < A.length / 2 ; j++) {
                int x = 0;
                x = A[i][j];
                A[i][j] = A[i][A.length - j - 1];
                A[i][A.length - j - 1] = x;

//                System.out.println(1 ^ A[i][j]);
            }
            System.out.println("========");
//            第二次双层for遍历
//            将0变为1,1变为0     1 ^ A[i][j]

            for (int j = 0; j < A.length ; j++) {
                A[i][j] = 1 ^ A[i][j];
            }
        }

        return A;
    }
}

/**
 *
 */
class Solution2 {
    public int[][] flipAndInvertImage(int[][] A) {

        if (A == null) return null;
        for (int[] row : A) {
            if (row == null) continue;
            //实现首尾交换，比上一个方案更好
            for (int i = 0, j = row.length - 1; i < j; ++i,--j) {
                int t = row[i];
                row[i] = row[j];
                row[j] = t;
            }

            for(int i = 0; i < row.length; ++i) {
                row[i] = row[i] ^ 1;
            }
        }
        return A;
    }
}