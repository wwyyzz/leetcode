/**
 104. 二叉树的最大深度
 给定一个二叉树，找出其最大深度。

 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。

 说明: 叶子节点是指没有子节点的节点。

 示例：
 给定二叉树 [3,9,20,null,null,15,7]，

 3
 / \
 9  20
 /  \
 15   7
 返回它的最大深度 3 。
 */

package Question.Tree.Q104_pass;

import Question.Tree.TreeNode;

import java.util.LinkedList;

/**
 执行用时：
 2 ms
 , 在所有 Java 提交中击败了
 6.29%
 的用户
 内存消耗：
 39.5 MB
 , 在所有 Java 提交中击败了
 88.11%
 的用户
 */
public class Solution1 {
    public int maxDepth(TreeNode root){
        int depth = 0;

        if (null == root) {
            return depth;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        depth = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (null != node.left) {
                    queue.offer(node.left);
                }
                if (null != node.right) {
                    queue.offer(node.right);
                }

            }
            depth++;
        }

        System.out.println("depth :" + depth);
        return depth - 1;

    }
}
