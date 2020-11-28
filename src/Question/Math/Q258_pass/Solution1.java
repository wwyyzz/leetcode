/**
 258. 各位相加
 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。

 示例:

 输入: 38
 输出: 2
 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 进阶:
 你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
 */

package Question.Math.Q258_pass;

/**
 执行用时：
 1 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 35.5 MB, 在所有 Java 提交中击败了86.21%的用户
 */
public class Solution1 {
    public int addDigits(int num){
        while (num > 9) {
            num = digital_add(num);
        }

        return num;

    }

    private int digital_add(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }

        System.out.println(sum);
        return sum;
    }
}
