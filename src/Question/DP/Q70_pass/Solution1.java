/**
 70. 爬楼梯
 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 注意：给定 n 是一个正整数。

 示例 1：
 输入： 2
 输出： 2
 解释： 有两种方法可以爬到楼顶。
 1.  1 阶 + 1 阶
 2.  2 阶

 示例 2：
 输入： 3
 输出： 3
 解释： 有三种方法可以爬到楼顶。
 1.  1 阶 + 1 阶 + 1 阶
 2.  1 阶 + 2 阶
 3.  2 阶 + 1 阶
 */

package Question.DP.Q70_pass;

import java.util.HashMap;

/**
 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 35.7 MB, 在所有 Java 提交中击败了25.41%的用户


 */
public class Solution1 {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int climbStairs(int n){
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int result = 0;
        if (n <= 3) {
            result = n;
        }else{
            result  = climbStairs(n  -1) + climbStairs(n - 2);
        }

        map.put(n, result);
        return result;
    }
}
