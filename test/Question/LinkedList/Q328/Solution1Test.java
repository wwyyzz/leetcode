package Question.LinkedList.Q328;

import Question.LinkedList.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void oddEvenList() {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        ListNode listNode = new Solution1().oddEvenList(a1);

        while (listNode != null) {
            System.out.println("lisstNode   :" + listNode);
            listNode = listNode.next;
        }

    }
}