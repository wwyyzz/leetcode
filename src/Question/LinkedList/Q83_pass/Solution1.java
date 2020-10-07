/**
 83. 删除排序链表中的重复元素
 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。

 示例 1:

 输入: 1->1->2
 输出: 1->2
 示例 2:

 输入: 1->1->2->3->3
 输出: 1->2->3
 */

package Question.LinkedList.Q83_pass;

import Question.LinkedList.ListNode;

/**
 执行用时：
 1 ms, 在所有 Java 提交中击败了76.07%的用户
 内存消耗：
 38.4 MB, 在所有 Java 提交中击败了66.07%的用户
 */
public class Solution1 {
    public ListNode deleteDuplicates(ListNode head){
        ListNode result = head;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return result;

    }
}
