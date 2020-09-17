/**
 206. 反转链表
 反转一个单链表。

 示例:

 输入: 1->2->3->4->5->NULL
 输出: 5->4->3->2->1->NULL
 进阶:
 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */

package Question.LinkedList.Q206;

import Question.LinkedList.ListNode;

import java.util.LinkedList;

/**

 */
public class Solution1 {
    public ListNode reverseList(ListNode head){

        ListNode result = new ListNode();
        result = head;

        LinkedList<Integer> stack = new LinkedList<>();

        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        System.out.println(stack);

        while (result != null) {
            Integer v = stack.pop();
            System.out.println("listnode : " + result.val);
            result.val = v;
            result = result.next;
        }

        System.out.println(result);
        return result;

    }
}
