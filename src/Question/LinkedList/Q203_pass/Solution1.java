/**
 203. 移除链表元素
 删除链表中等于给定值 val 的所有节点。

 示例:

 输入: 1->2->6->3->4->5->6, val = 6
 输出: 1->2->3->4->5
 */

package Question.LinkedList.Q203_pass;

import Question.LinkedList.ListNode;

/**
 执行用时：
 1 ms, 在所有 Java 提交中击败了99.59%的用户
 内存消耗：
 39.6 MB, 在所有 Java 提交中击败了87.03%的用户
 */
public class Solution1 {
    public ListNode removeElements(ListNode head, int val){

        ListNode dummy = new ListNode(val +1);
        dummy.next = head;

        ListNode node = dummy;

        while (node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }

        }

        return dummy.next;


    }
}
