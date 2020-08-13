package Question.Q19;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

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

        ListNode l = new Solution1().removeNthFromEnd(head, 2);

        
    }
}