package Question.LinkedList.Q83_pass;

import Question.LinkedList.ListNode;
import org.junit.Test;

public class Solution1Test {

    @Test
    public void deleteDuplicates() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l6 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(3);

        l1.next = l2;
        l2.next = l6;
        l6.next = l3;
        l3.next = l4;
        l4.next = l5;

        new Solution1().deleteDuplicates(l1);

    }
}