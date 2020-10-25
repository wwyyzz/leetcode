/**
 143. 重排链表
 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…

 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

 示例 1:
 给定链表 1->2->3->4, 重新排列为 1->4->2->3.

 示例 2:
 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
 */

package Question.LinkedList.Q143_pass;

import Question.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 12 / 13 个通过测试用例
 状态：超出时间限制
 */
public class Solution1 {
    public void reorderList(ListNode head){
        if (head == null) {
            return;
        }
        ArrayList<ListNode> list = new ArrayList<>();
        LinkedList<ListNode> list1 = new LinkedList<>();
        LinkedList<ListNode> list2 = new LinkedList<>();

        ListNode root = head;

        while (root != null) {
            list1.add(root);
            list2.addFirst(root);
            root = root.next;
        }

        for (int i = 0; i < list1.size() ; i++) {
            list1.get(i).next = null;
            list.add(list1.get(i));
            list2.get(i).next = null;
            list.add(list2.get(i));
        }

        ListNode next = new ListNode();
        head = list.get(0);
        ListNode pointer = head;

        for (int i = 0; i < list1.size() - 1; i++) {
            pointer = list.get(i);
            next = list.get(i + 1);
            pointer.next = next;
        }

        System.out.println(head);

    }
}
