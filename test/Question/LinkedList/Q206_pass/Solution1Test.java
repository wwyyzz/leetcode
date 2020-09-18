package Question.LinkedList.Q206_pass;

import Question.LinkedList.ListNode;
import org.junit.Test;

public class Solution1Test {

    @Test
    public void reverseList() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode head = node1;
        while (head != null) {
            System.out.println("listnode : " + head.val);
            head = head.next;
        }

        head = node1;

        ListNode listNode = new Solution1().reverseList(head);

        while (listNode != null) {
            System.out.println("listnode : " + listNode.val);
            listNode = listNode.next;
        }
    }
}