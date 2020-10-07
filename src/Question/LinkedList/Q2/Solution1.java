/**
 2. 两数相加
 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

 示例：

 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 输出：7 -> 0 -> 8
 原因：342 + 465 = 807
 */

package Question.LinkedList.Q2;

import Question.LinkedList.ListNode;

import java.util.LinkedList;

/**

 */
public class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode result = new ListNode(0);
        ListNode head = result;

        
        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val + head.val;
            if (val > 9) {
                head.val = val - 10;
                ListNode next = new ListNode(1);
                head.next = next;
                head = next;
            } else {
                head.val = val;
                ListNode next = new ListNode(0);
                head.next = next;
                head = next;
            }

            l1 = l1.next;
            l2 = l2.next;

        }


        return result;

    }
}
