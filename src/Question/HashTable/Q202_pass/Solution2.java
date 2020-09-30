/**
 202. 快乐数
 编写一个算法来判断一个数 n 是不是快乐数。

 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。

 如果 n 是快乐数就返回 True ；不是，则返回 False 。

 示例：

 输入：19
 输出：true
 解释：
 12 + 92 = 82
 82 + 22 = 68
 62 + 82 = 100
 12 + 02 + 02 = 1
 */

package Question.HashTable.Q202_pass;

import java.util.ArrayList;
import java.util.HashSet;

/**
 执行用时：
 23 ms, 在所有 Java 提交中击败了5.08%的用户
 内存消耗：
 38.1 MB, 在所有 Java 提交中击败了5.01%的用户
 */
public class Solution2 {
    public boolean isHappy(int n){

        HashSet<Integer> set = new HashSet<>();

        while (true) {
            if (set.contains(n)) {
                return false;
            } else {
                set.add(n);
            }
            ArrayList<Integer> digitals = new ArrayList<>();
            while (n > 9){
                digitals.add(n % 10);
                n = n / 10;
            }
            digitals.add(n);

            System.out.println(digitals);

            n = 0;
            for (Integer digital : digitals) {
                n += digital * digital;
            }

            if (n == 1) {
                return true;
            }

        }

    }
}
