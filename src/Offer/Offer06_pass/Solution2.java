/**
 剑指 Offer 06. 从尾到头打印链表
 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
  
 示例 1：
 输入：head = [1,3,2]
 输出：[2,3,1]
  
 限制：
 0 <= 链表长度 <= 10000

 作者：Krahets
 链接：https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/5dt66m/
 来源：力扣（LeetCode）
 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */

package Offer.Offer06_pass;

import Offer.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 执行用时：
 1 ms, 在所有 Java 提交中击败了73.67%的用户
 内存消耗：
 39.4 MB, 在所有 Java 提交中击败了54.84%的用户

 相对于 Solution1 ，使用stack 替代 ArrayList，整体逻辑没变，但是更清晰。
 反向的问题都可以考虑使用stack
 */
public class Solution2 {
    public int[] reversePrint(ListNode head){
        LinkedList<Integer> stack = new LinkedList<>();

        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        int[] result = new int[stack.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = stack.pop();
        }

        System.out.println(Arrays.toString(result));
        return result;

    }
}
