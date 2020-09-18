package Question.LinkedList.Q19_pass;

import Question.LinkedList.ListNode;
import org.junit.Test;

public class Solution2Test {

    @Test
    public void removeNthFromEnd() {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        ListNode head = a1;

        ListNode nodes = new Solution2().removeNthFromEnd(head, 2);

        while (nodes != null){
            System.out.println(nodes.val);
            nodes = nodes.next;
        }
    }

    @Test
    public void removeNthFromEnd2() {
        ListNode a1 = new ListNode(1);

        ListNode head = a1;

        ListNode nodes = new Solution2().removeNthFromEnd(head, 1);

        while (nodes != null){
            System.out.println(nodes.val);
            nodes = nodes.next;
        }
    }

    @Test
    public void removeNthFromEnd3() {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);

        ListNode head = a1;
        a1.next = a2;

        ListNode nodes = new Solution2().removeNthFromEnd(head, 2);

        while (nodes != null){
            System.out.println(nodes.val);
            nodes = nodes.next;
        }
    }
}