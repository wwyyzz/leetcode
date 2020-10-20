/**
 143. 重排链表
 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…

 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

 示例 1:
 给定链表 1->2->3->4, 重新排列为 1->4->2->3.

 示例 2:
 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
 */

package Question.LinkedList.Q143_pass;

import Question.LinkedList.ListNode;

import java.util.LinkedList;

/**
 执行用时：
 5 ms, 在所有 Java 提交中击败了14.22%的用户
 内存消耗：
 41.9 MB, 在所有 Java 提交中击败了29.65%的用户

 head.next后面的存储在双向队列里面，交替从队尾、队首取出
 */
public class Solution2 {
    public void reorderList(ListNode head){
        if (head == null) {
            return;
        }
        LinkedList<ListNode> list = new LinkedList<>();

        ListNode next = head.next;

        while (next != null) {
            list.add(next);
            next = next.next;
        }

        ListNode pointer = head;
        while (!list.isEmpty()) {
            pointer.next = list.pollLast();
            pointer = pointer.next;

            if (!list.isEmpty()) {
                pointer.next = list.pollFirst();
                pointer = pointer.next;
            }

        }
        pointer.next =null;
        System.out.println(head);

        System.out.println(head);

    }
}
