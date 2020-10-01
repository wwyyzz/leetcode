package Offer.Offer22_pass;

import Offer.ListNode;
import org.junit.Test;

public class Solution3Test {

    @Test
    public void getKthFromEnd() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        new Solution3().getKthFromEnd(n1, 2);
    }
}