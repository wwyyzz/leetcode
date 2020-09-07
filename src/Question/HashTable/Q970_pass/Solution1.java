/**
 970. 强整数
 给定两个正整数 x 和 y，如果某一整数等于 x^i + y^j，其中整数 i >= 0 且 j >= 0，那么我们认为该整数是一个强整数。

 返回值小于或等于 bound 的所有强整数组成的列表。

 你可以按任何顺序返回答案。在你的回答中，每个值最多出现一次。

 示例 1：
 输入：x = 2, y = 3, bound = 10
 输出：[2,3,4,5,7,9,10]
 解释：
 2 = 2^0 + 3^0
 3 = 2^1 + 3^0
 4 = 2^0 + 3^1
 5 = 2^1 + 3^1
 7 = 2^2 + 3^1
 9 = 2^3 + 3^0
 10 = 2^0 + 3^2

 示例 2：
 输入：x = 3, y = 5, bound = 15
 输出：[2,4,6,8,10,14]

 提示：

 1 <= x <= 100
 1 <= y <= 100
 0 <= bound <= 10^6
 */

package Question.HashTable.Q970_pass;

import java.util.ArrayList;
import java.util.List;

/**
 执行用时：
 1 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 37.2 MB, 在所有 Java 提交中击败了80.55%的用户
 */
public class Solution1 {
    public List<Integer> powerfulIntegers(int x, int y, int bound){
        List<Integer> result = new ArrayList<>();
        int a = x;
        int pow_x = 0;
        int b = y;
        int pow_y = 0;

        if (x == 1 ) {
            pow_x = 1;
        }else {
            while (a < bound) {
                pow_x++;
                a *= x;
            }
        }

        if (y == 1 ) {
            pow_y = 1;
        }else{
            while (b < bound) {
                pow_y++;
                b *= y;
            }
        }

        System.out.println("pow_x  :" + pow_x);
        System.out.println("pow_y  :" + pow_y);

        for (int i = 0; i <= pow_x ; i++) {
            for (int j = 0; j <= pow_y ; j++) {
                int total = (int) (Math.pow(x, i) + Math.pow(y, j));
                if (total <= bound && ! result.contains(total)) {
                    result.add(total);
                }
            }
        }

        System.out.println(result);
        return result;

    }
}
