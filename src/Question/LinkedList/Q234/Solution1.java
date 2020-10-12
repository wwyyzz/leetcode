/**
 234. 回文链表
 请判断一个链表是否为回文链表。

 示例 1:
 输入: 1->2
 输出: false

 示例 2:
 输入: 1->2->2->1
 输出: true

 进阶：
 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */

package Question.LinkedList.Q234;

import Question.LinkedList.ListNode;

import java.util.LinkedList;

/**
 执行用时：
 1171 ms, 在所有 Java 提交中击败了6.22%的用户
 内存消耗：
 42.5 MB, 在所有 Java 提交中击败了29.53%的用户

 不满足 进阶：
 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？

 */
public class Solution1 {
    public boolean isPalindrome(ListNode head){
        boolean result = true;

        LinkedList<Integer> list = new LinkedList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        System.out.println(list);

        for (int i = 0; i < (list.size() / 2); i++) {
            if (list.get(i).compareTo(list.get(list.size() - 1 - i)) != 0) {
                return false;
            }
        }

        return result;

    }
}
