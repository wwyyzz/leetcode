/**
 509. 斐波那契数
 斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：

 F(0) = 0,   F(1) = 1
 F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 给定 N，计算 F(N)。

 示例 1：
 输入：2
 输出：1
 解释：F(2) = F(1) + F(0) = 1 + 0 = 1.

 示例 2：
 输入：3
 输出：2
 解释：F(3) = F(2) + F(1) = 1 + 1 = 2.

 示例 3：
 输入：4
 输出：3
 解释：F(4) = F(3) + F(2) = 2 + 1 = 3.

 提示：
 0 ≤ N ≤ 30
 */

package Offer.Offer10_pass;

/**
 不使用数组，节省存储空间

 空间复杂度降低：

 若新建长度为 nn 的 dpdp 列表，则空间复杂度为 O(N)O(N) 。

 由于 dpdp 列表第 ii 项只与第 i-1i−1 和第 i-2i−2 项有关，因此只需要初始化三个整形变量 sum, a, b ，
 利用辅助变量 sumsum 使 a, ba,b 两数字交替前进即可 （具体实现见代码） 。
 因为节省了 dpdp 列表空间，因此空间复杂度降至 O(1)O(1) 。

 */
public class Solution4 {
    public int fib(int N){
        if (N < 2) {
            return N;
        }

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 1; i < N  ; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }

        return sum;
    }
}
