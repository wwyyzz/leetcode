/**
 206. 反转链表
 反转一个单链表。

 示例:

 输入: 1->2->3->4->5->NULL
 输出: 5->4->3->2->1->NULL
 进阶:
 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */

package Question.LinkedList.Q206_pass;

import Question.LinkedList.ListNode;

import java.util.LinkedList;

/**
 执行用时：
 1 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 38.7 MB, 在所有 Java 提交中击败了63.19%的用户
 */
public class Solution1 {
    public ListNode reverseList(ListNode head){

        ListNode nodes = head;
        LinkedList<Integer> stack = new LinkedList<>();

        while (nodes != null) {
            stack.push(nodes.val);
            nodes = nodes.next;
        }

        System.out.println(stack);
        nodes = head;
        while (nodes != null) {
            Integer v = stack.pop();
            nodes.val = v;
            nodes = nodes.next;
        }

        System.out.println(head);
        return head;

    }
}
