/**
 343. 整数拆分
 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。

 示例 1:

 输入: 2
 输出: 1
 解释: 2 = 1 + 1, 1 × 1 = 1。
 示例 2:

 输入: 10
 输出: 36
 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。
 说明: 你可以假设 n 不小于 2 且不大于 58。
 */

package Question.Math.Q343;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 测视例过不去。输入8，预期应该为18。
 */
public class Solution1 {
    public int integerBreak(int n) {
        int result = 1;
        ArrayList<Integer> list =new ArrayList<>();

        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(n);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int num = queue.poll();
                int[] s = split(num);

                for (int i1 : s) {
                    if (i1 == 1 || i1 == 2 || i1 == 3) {
                        list.add(i1);
                    } else {
                        queue.add(i1);
                    }
                }

            }
        }

        System.out.println(list);
        for (Integer integer : list) {
            result *= integer;
        }
        return result;
    }

    private int[] split(int n) {
        int[] m ={0, 0};
        int n1 = 0;
        int n2 = 0;

        if (n % 2 == 0) {
            n1 = n / 2;
            n2 = n / 2;
        } else {
            n1 = n / 2 ;
            n2 = n1 + 1 ;
        }

        m[0] = n1;
        m[1] = n2;

        System.out.println("n1  :" + n1);
        System.out.println("n2  :" + n2);
        return m;
    }
}
