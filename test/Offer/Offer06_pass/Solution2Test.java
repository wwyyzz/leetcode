package Offer.Offer06_pass;

import Offer.ListNode;
import org.junit.Test;

public class Solution2Test {

    @Test
    public void reversePrint() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(2);

        n1.next = n2;
        n2.next = n3;

        new Solution2().reversePrint(n1);
    }
}