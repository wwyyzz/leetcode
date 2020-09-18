/**
 19. 删除链表的倒数第N个节点
 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

 示例：

 给定一个链表: 1->2->3->4->5, 和 n = 2.

 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 说明：

 给定的 n 保证是有效的。

 进阶：

 你能尝试使用一趟扫描实现吗？
 */

package Question.LinkedList.Q19_pass;

import Question.LinkedList.ListNode;

/**
 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 37.3 MB, 在所有 Java 提交中击败了8.71%的用户
 */
public class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n){

        int len = 0;

        ListNode nodes = head;
        ListNode dummy = new ListNode();
        dummy.next = head;

        while (nodes != null){
            System.out.println(nodes.val);
            nodes = nodes.next;
            len++;
        }


        System.out.println("length :" + len);

        nodes = dummy;
        int pos = len - n;
        int count = 0;
        while (count < pos) {
            nodes = nodes.next;
            count++;
        }

        nodes.next = nodes.next.next;

        return dummy.next;

    }
}
