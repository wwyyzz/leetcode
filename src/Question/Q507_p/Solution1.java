/**
 * 507. 完美数
 *
 * 对于一个 正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。
 * 给定一个 正整数 n， 如果他是完美数，返回 True，否则返回 False
 *
 * 示例：
 * 输入: 28
 * 输出: True
 * 解释: 28 = 1 + 2 + 4 + 7 + 14
 *
 * 注意:
 * 输入的数字 n 不会超过 100,000,000. (1e8)
 */
package Question.Q507_p;

/**
 * 测试例无法全部通过，对于 num = 100,000,000 时超时
 */
public class Solution1 {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 2; i <= num / 2 ; i++) {
            if (num % i == 0){
//                System.out.println("i =" + i);
                sum += i;
            }
        }

        return num == 1 + sum;
    }
}

/**
 * 156 / 156 个通过测试用例
 * 状态：通过
 * 执行用时：14 ms
 *
 * 我的提交执行用时
 * 已经战胜 64.91 % 的 java 提交记录
 *
 * 优化后只需要一半的时间
 */
class Solution2 {
    public boolean checkPerfectNumber(int num) {
        if (num ==1) return false;

        int sum = 1;
        for (int i = 2; i *i < num ; i++) {
            if (num % i == 0){
                System.out.println("i =" + i);
                sum = sum + i + num / i;
                System.out.println("sum = " + sum);
            }
        }

        return num == sum;
    }
}