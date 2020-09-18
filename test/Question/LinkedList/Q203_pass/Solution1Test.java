package Question.LinkedList.Q203_pass;

import Question.LinkedList.ListNode;
import org.junit.Test;

public class Solution1Test {

    @Test
    public void removeElements() {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(6);
        ListNode a4 = new ListNode(3);
        ListNode a5 = new ListNode(4);
        ListNode a6 = new ListNode(5);
        ListNode a7 = new ListNode(6);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;

        ListNode listNode = new Solution1().removeElements(a1, 6);

        while (listNode != null) {
            System.out.println("listNode : " + listNode.val);
            listNode = listNode.next;
        }
    }

    @Test
    public void removeElements2() {
        ListNode a1 = new ListNode(1);

        ListNode listNode = new Solution1().removeElements(a1, 2);

        while (listNode != null) {
            System.out.println("listNode : " + listNode.val);
            listNode = listNode.next;
        }
    }
}