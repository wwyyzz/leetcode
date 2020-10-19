/**
 779. 第K个语法符号
 在第一行我们写上一个 0。接下来的每一行，将前一行中的0替换为01，1替换为10。
 给定行数 N 和序数 K，返回第 N 行中第 K个字符。（K从1开始）

 例子:
 输入: N = 1, K = 1
 输出: 0

 输入: N = 2, K = 1
 输出: 0

 输入: N = 2, K = 2
 输出: 1

 输入: N = 4, K = 5
 输出: 1
 解释:
 第一行: 0
 第二行: 01
 第三行: 0110
 第四行: 01101001

 注意：
 N 的范围 [1, 30].
 K 的范围 [1, 2^(N-1)].
 */

package Question.BFS.Q779_p;

import java.util.LinkedList;

/**

 状态：超出时间限制
 */
public class Solution1 {
    public int kthGrammar(int N, int K) {
        int result = 0;

        LinkedList<Character> queue = new LinkedList<>();
        queue.offer('0');
        int count = 2;

        while (count <= N) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Character c = queue.poll();
                if ( '0' == c) {
                    queue.offer('0');
                    queue.offer('1');
                } else {
                    queue.offer('1');
                    queue.offer('0');
                }

            }
            count++;
        }

//        System.out.println(queue);
        return queue.get(K - 1) - '0';

    }
}
