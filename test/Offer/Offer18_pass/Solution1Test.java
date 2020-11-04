package Offer.Offer18_pass;

import Question.LinkedList.ListNode;
import org.junit.Test;

public class Solution1Test {

    @Test
    public void deleteNode() {
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(9);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        new Solution1().deleteNode(l1, 5);
    }

    @Test
    public void deleteNode2() {
        ListNode l1 = new ListNode(-3);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(-99);

        l1.next = l2;
        l2.next = l3;

        new Solution1().deleteNode(l1, -99);
    }
}