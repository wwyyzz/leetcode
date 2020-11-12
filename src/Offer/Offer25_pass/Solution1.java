/**
 剑指 Offer 25. 合并两个排序的链表
 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。

 示例1：

 输入：1->2->4, 1->3->4
 输出：1->1->2->3->4->4
 限制：

 0 <= 链表长度 <= 1000

 注意：本题与主站 21 题相同：https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */

package Offer.Offer25_pass;

import Offer.ListNode;

import java.util.ArrayList;

/**
 执行用时：
 6 ms, 在所有 Java 提交中击败了98.92%的用户
 内存消耗：
 38.7 MB, 在所有 Java 提交中击败了78.56%的用户
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

        // System.out.println(list);
        ListNode head = result;
        for (Integer integer : list) {
            head.next = new ListNode(integer);
            head = head.next;
        }


        return result.next;

    }
}
