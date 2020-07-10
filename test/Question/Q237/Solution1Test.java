package Question.Q237;

import org.junit.Test;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution1Test {

    @Test
    public void deleteNode() {
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(5);
        ListNode a3 = new ListNode(1);
        ListNode a4 = new ListNode(9);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        ListNode next = a1;
        while (next != null){
            System.out.println(next.val);
            next = next.next;
        }

    }
}

