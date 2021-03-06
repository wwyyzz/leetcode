/**
 剑指 Offer 09. 用两个栈实现队列
 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )


 示例 1：
 输入：
 ["CQueue","appendTail","deleteHead","deleteHead"]
 [[],[3],[],[]]
 输出：[null,null,3,-1]

 示例 2：
 输入：
 ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 [[],[],[5],[2],[],[]]
 输出：[null,-1,null,null,5,2]

 提示：
 1 <= values <= 10000
 最多会对 appendTail、deleteHead 进行 10000 次调用
 */

package Offer.Offer09_pass;

import java.util.LinkedList;

/**

 */
public class Solution1 {
    final LinkedList<Integer> stack_a;
    final LinkedList<Integer> stack_b;

    public Solution1() {
        stack_a = new LinkedList<>();
        stack_b = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack_a.push(value);
    }

    public int deleteHead() {
        if (stack_a.isEmpty()) {
            return -1;
        }
        while (!stack_a.isEmpty()) {
            stack_b.push(stack_a.pop());
        }

        int delete_val = stack_b.pop();

        while (!stack_b.isEmpty()) {
            stack_a.push(stack_b.pop());
        }
        return delete_val;
    }

}
