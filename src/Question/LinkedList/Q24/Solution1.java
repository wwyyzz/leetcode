/**
 24. 两两交换链表中的节点
 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

 示例:
 给定 1->2->3->4, 你应该返回 2->1->4->3.
 */

package Question.LinkedList.Q24;

import Question.LinkedList.ListNode;

/**
 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 36.3 MB, 在所有 Java 提交中击败了88.24%的用户

 关键在于画出链表的图，以及如何变换的逻辑
 此时一定要画图，不画图，操作多个指针很容易乱，而且要操作的先后顺序
 */
public class Solution1 {
    public ListNode swapPairs(ListNode head){
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;

        ListNode temp = dummyHead;
        while (temp.next != null && temp.next.next != null) {
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;

            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;

            temp = node1;
        }

        return dummyHead.next;

    }
}
