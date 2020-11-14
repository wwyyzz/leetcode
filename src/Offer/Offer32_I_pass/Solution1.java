/**
 剑指 Offer 32 - I. 从上到下打印二叉树
 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。

 例如:
 给定二叉树: [3,9,20,null,null,15,7],

   3
  / \
  9  20
    /  \
   15   7
 返回：
 [3,9,20,15,7]

 提示：
 节点总数 <= 1000
 */

package Offer.Offer32_I_pass;

import Question.Tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 执行用时：
 1 ms, 在所有 Java 提交中击败了99.81%的用户
 内存消耗：
 38.6 MB, 在所有 Java 提交中击败了80.72%的用户
 */
public class Solution1 {
    public int[] levelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (null == root) {
            return new int[]{};
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
//        result.add(Arrays.asList(root.val));

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                result.add(node.val);
                if (null != node.left) {
                    queue.offer(node.left);
                }
                if (null != node.right) {
                    queue.offer(node.right);
                }

            }
//            result.add(list);

        }

        // System.out.println("arrays :" + result);

        int[] arr = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }

        System.out.println(Arrays.toString(arr));
        return arr;

    }
}
