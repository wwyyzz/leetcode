/**
 剑指 Offer 49. 丑数
 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。

 示例:
 输入: n = 10
 输出: 12
 解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。

 说明:  
 1 是丑数。
 n 不超过1690。
 注意：本题与主站 264 题相同：https://leetcode-cn.com/problems/ugly-number-ii/

 */

package Offer.Offer49;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**

 */
public class Solution1 {
    public int nthUglyNumber(int n){

        Set<Integer> set = new HashSet<>();

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(1);

        while (set.size() < 100) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int num = queue.poll();
                queue.offer(num * 2);
                queue.offer(num * 3);
                queue.offer(num * 5);

                set.add(num * 2);
                set.add(num * 3);
                set.add(num * 5);

            }
        }

        System.out.println(set);
        System.out.println(queue);
        return n;

    }
}
