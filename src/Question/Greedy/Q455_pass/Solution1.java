/**
 455. 分发饼干
 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
 对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；
 并且每块饼干 j，都有一个尺寸 s[j] 。如果 s[j] >= g[i]，我们可以将这个饼干 j 分配给孩子 i ，
 这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。

 示例 1:
 输入: g = [1,2,3], s = [1,1]
 输出: 1
 解释:
 你有三个孩子和两块小饼干，3个孩子的胃口值分别是：1,2,3。
 虽然你有两块小饼干，由于他们的尺寸都是1，你只能让胃口值是1的孩子满足。
 所以你应该输出1。

 示例 2:
 输入: g = [1,2], s = [1,2,3]
 输出: 2
 解释:
 你有两个孩子和三块小饼干，2个孩子的胃口值分别是1,2。
 你拥有的饼干数量和尺寸都足以让所有孩子满足。
 所以你应该输出2.

 提示：
 1 <= g.length <= 3 * 104
 0 <= s.length <= 3 * 104
 1 <= g[i], s[j] <= 231 - 1
 */

package Question.Greedy.Q455_pass;

import java.util.Arrays;

/**
 执行用时：
 9 ms, 在所有 Java 提交中击败了21.30%的用户
 内存消耗：
 39.6 MB, 在所有 Java 提交中击败了50.71%的用户

 贪心的思想是，用尽量小的饼干去满足小需求的孩子，所以需要先进行排序
 */
public class Solution1 {
    public int findContentChildren(int[] g, int[] s){
        int children = 0;

        Arrays.sort(g);
        Arrays.sort(s);
        int pointer_g = 0;
        int pointer_s = 0;

        while (pointer_g < g.length && pointer_s < s.length) {
            if (s[pointer_s] >= g[pointer_g]) {
                children++;
                pointer_g++;
                pointer_s++;
            } else {
                pointer_s++;
            }
        }

        System.out.println(children);
        return children;

    }
}
