/**
 279. 完全平方数
 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。

 示例 1:

 输入: n = 12
 输出: 3
 解释: 12 = 4 + 4 + 4.
 示例 2:

 输入: n = 13
 输出: 2
 解释: 13 = 4 + 9.
 */

package Question.Q279;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**

 */
public class Solution2 {
    public int numSquares(int n){
        ArrayList<Integer> squares = new ArrayList();
        for (int i = 0; i*i <= n; i++) {
            squares.add(i*i);
        }

//        System.out.println(squares);

        // 1. 队列
        LinkedList<Integer> queue = new LinkedList<>();
        // 2. 已访问的集合
        HashSet<Integer> visited = new HashSet<>();

        // 队列和集合都加入首节点
        queue.offer(n);
        visited.add(n);
        int level = 0;  // 记录当前访问的层数

        while (!queue.isEmpty()){
            level++;
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int cur = queue.poll();
                for (Integer square : squares) {
                    int tmp = cur - square;
                    // 找到了最短路径（图中绿色圈圈）
                    if (tmp == 0){
                        return level;
                    }
                    // 剪枝（对应图中红色圈圈）
                    if (!visited.contains(tmp)){
                        queue.offer(tmp);
                    }
                    // 加入set中为了减枝操作
                    visited.add(tmp);
                }

            }
//            System.out.println(queue);
        }
        return level;

    }
}
