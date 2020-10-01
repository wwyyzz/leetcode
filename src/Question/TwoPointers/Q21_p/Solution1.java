/**
 21. 合并两个有序链表
 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。


 示例：

 输入：1->2->4, 1->3->4
 输出：1->1->2->3->4->4
 */

package Question.TwoPointers.Q21_p;

import Question.LinkedList.ListNode;

import java.util.ArrayList;

/**
 执行用时：
 4 ms, 在所有 Java 提交中击败了62.73%的用户
 内存消耗：
 38.6 MB, 在所有 Java 提交中击败了33.58%的用户
 */
public class Solution1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode result = new ListNode();

        ArrayList<Integer> list = new ArrayList<>();

        while (l1 != null) {
            list.add(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            list.add(l2.val);
            l2 = l2.next;
        }

        list.sort((o1, o2) -> o1 - o2);

        System.out.println(list);
        ListNode head = result;
        for (Integer integer : list) {
            ListNode node = new ListNode(integer);
            head.next = node;
            head = head.next;
        }


        return result.next;


    }
}
