package Question.LinkedList.Q234;

import Question.LinkedList.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isPalindrome() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(1);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        assertTrue(new Solution1().isPalindrome(l1));
    }

    @Test
    public void isPalindrome2() {
        ListNode l1 = new ListNode(-129);
        ListNode l2 = new ListNode(-129);


        l1.next = l2;

        assertTrue(new Solution1().isPalindrome(l1));
    }
}