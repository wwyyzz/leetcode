package Question.Q237_p;

import org.junit.Test;


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

        ListNode head = a1;

//        new Solution1().deleteNode(a2);
        new Solution1().deleteNode(a3);
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }



    }
}

