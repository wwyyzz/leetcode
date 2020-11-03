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

import java.util.HashMap;

/**
 记忆化
 为了消除上述情况中的重复计算，正如许多人已经指出的那样，其中一个想法是将中间结果存储在缓存中，以便我们以后可以重用它们，而不需要重新计算。

 这个想法也被称为记忆化，这是一种经常与递归一起使用的技术。

 记忆化 是一种优化技术，主要用于加快计算机程序的速度，方法是存储昂贵的函数调用的结果，并在相同的输入再次出现时返回缓存的结果。 (来源: 维基百科)

 回到斐波那契函数 F(n)。 我们可以使用哈希表来跟踪每个以 n 为键的 F(n) 的结果。 散列表作为一个缓存，可以避免重复计算。 记忆化技术是一个很好的例子，它演示了如何通过增加额外的空间以减少计算时间。

 对于 N= 10 :
 无记忆化，递归177次
 有记忆化，递归19次

 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 35.3 MB, 在所有 Java 提交中击败了95.96%的用户
 */
public class Solution2 {
    HashMap<Integer,Integer> map = new HashMap<>();
    int count = 0;
    public int fib(int N){
        count++;
        System.out.println(count);
        if (map.containsKey(N)) {
            return map.get(N);
        }
        int result ;
        if (N <= 1) {
            result = N;
        } else {
            result = fib(N - 1) + fib(N - 2);
        }

        map.put(N, result);
        return result;
    }
}
