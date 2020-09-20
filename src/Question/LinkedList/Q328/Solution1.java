/**
 328. 奇偶链表
 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。

 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。

 示例 1:

 输入: 1->2->3->4->5->NULL
 输出: 1->3->5->2->4->NULL
 示例 2:

 输入: 2->1->3->5->6->4->7->NULL
 输出: 2->3->6->7->1->5->4->NULL
 说明:

 应当保持奇数节点和偶数节点的相对顺序。
 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。
 */

package Question.LinkedList.Q328;

import Question.LinkedList.ListNode;

/**

 */
public class Solution1 {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode();
        ListNode even = new ListNode();

        int count = 1;
        ListNode node = head;
        ListNode node_odd = odd;
        ListNode node_even = even;

        while (node != null) {
            ListNode tmp = new ListNode(node.val);

            if (count % 2 != 0) {
                node_odd.next = tmp;
                node_odd = node_odd.next;


            } else {
                node_even.next = tmp;
                node_even = node_even.next;
            }
            node = node.next;
            count++;
        }

        System.out.println("odd  :" + odd);
        System.out.println("even :" + even);

        head = odd;
        while (head != null) {
            head = head.next;
        }

        head.next = even;

        return head;
    }
}
