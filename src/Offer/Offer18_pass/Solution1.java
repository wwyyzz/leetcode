/**
 剑指 Offer 18. 删除链表的节点
 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 返回删除后的链表的头节点。
 注意：此题对比原题有改动

 示例 1:
 输入: head = [4,5,1,9], val = 5
 输出: [4,1,9]
 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.

 示例 2:
 输入: head = [4,5,1,9], val = 1
 输出: [4,5,9]
 解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.

 说明：
 题目保证链表中节点的值互不相同
 若使用 C 或 C++ 语言，你不需要 free 或 delete 被删除的节点
 */

package Offer.Offer18_pass;

import Question.LinkedList.ListNode;

/**
 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 37.7 MB, 在所有 Java 提交中击败了94.16%的用户
 */
public class Solution1 {
    public ListNode deleteNode(ListNode head, int val){
//        可以通过添加伪节点，来避免判断头结点
//        if (head.val == val) {
//            return head.next;
//        }

        ListNode result;

        ListNode first = new ListNode();
        first.next = head;
        ListNode second = head;
        result = first;


        while (first.next != null) {
            if (second.val == val) {
                first.next = second.next;
                return result.next;
            }
            first = second;
            second = second.next;
        }

        return head;

    }
}
