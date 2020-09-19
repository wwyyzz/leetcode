/**
 404. 左叶子之和
 计算给定二叉树的所有左叶子之和。

 示例：

 3
 / \
 9  20
 /  \
 15   7

 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 */

package Question.Tree.Q404;

import Question.Tree.TreeNode;

import java.util.LinkedList;

/**

 */
public class Solution1 {
    public int sumOfLeftLeaves(TreeNode root) {
        int result = 0;
        if (root == null) {
            return result;
        }
        LinkedList<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null ) {
                    queue.offer(node.left);
                    if (node.left.left == null && node.left.right == null)
                    result += node.left.val;
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
