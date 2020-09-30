/**
 剑指 Offer 22. 链表中倒数第k个节点
 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。

 示例：
 给定一个链表: 1->2->3->4->5, 和 k = 2.
 返回链表 4->5.
 */

package Offer.Offer22;

import Offer.ListNode;

import java.util.ArrayList;

/**
 Solution1需要多占用一个List空间，优化如下
 需要遍历两次链表，还可以使用双指针继续优化
 */
public class Solution2 {
    public ListNode getKthFromEnd(ListNode head, int k){
        ListNode node = new ListNode();

        int size = 0;
        node = head;
        while (node != null) {
            size++;
            node = node.next;
        }
        int n = size - k;
        node = head;
        while (n > 0) {
            node = node.next;
            n--;
        }

        System.out.println(node);

        return node;

    }
}
