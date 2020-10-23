/**
 397. 整数替换
 给定一个正整数 n，你可以做如下操作：

 1. 如果 n 是偶数，则用 n / 2替换 n。
 2. 如果 n 是奇数，则可以用 n + 1或n - 1替换 n。
 n 变为 1 所需的最小替换次数是多少？

 示例 1:
 输入:
 8
 输出:
 3
 解释:
 8 -> 4 -> 2 -> 1

 示例 2:
 输入:
 7
 输出:
 4
 解释:
 7 -> 8 -> 4 -> 2 -> 1
 或
 7 -> 6 -> 3 -> 2 -> 1
 */

package Question.Q397;

import java.util.HashMap;

/**

 */
public class Solution1 {
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    public int integerReplacement(int n){
        int result = 0;

        helper(n);
        System.out.println(count);
        return count;

    }

    private int helper (int num) {
//        if (map.containsKey(num)) {
//            return map.get(num);
//        }
        if (num == 1) {
            return 0;
        }
        if (num % 2 == 0) {
            count++;
            int result = helper( num / 2);
//            map.put(num/2, result);
        } else {
            count++;
            int result = helper(num - 1);
//            map.put(num - 1, result);
        }

        return count;
    }
}
