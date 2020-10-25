package Question.LinkedList.Q143_pass;

import Question.LinkedList.ListNode;
import org.junit.Test;

public class Solution1Test {

    @Test
    public void reorderList() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        new Solution1().reorderList(l1);
    }

    @Test
    public void reorderList2() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);


        l1.next = l2;
        l2.next = l3;
        l3.next = l4;


        new Solution1().reorderList(l1);
    }
}