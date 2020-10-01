package Question.TwoPointers.Q21_p;

import Question.LinkedList.ListNode;
import org.junit.Test;

public class Solution1Test {

    @Test
    public void mergeTwoLists() {
        ListNode l1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        l1.next = node2;
        node2.next = node3;


        ListNode l2 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        l2.next = node4;
        node4.next = node5;

        new Solution1().mergeTwoLists(l1,l2);
    }
}