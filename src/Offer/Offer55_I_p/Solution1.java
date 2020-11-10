/**
 剑指 Offer 55 - I. 二叉树的深度
 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，
 最长路径的长度为树的深度。

 例如：
 给定二叉树 [3,9,20,null,null,15,7]，
    3
   / \
  9  20
    /  \
   15   7
 返回它的最大深度 3 。

 提示：
 节点总数 <= 10000
 注意：本题与主站 104 题相同：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 */

package Offer.Offer55_I_p;

import Question.Tree.TreeNode;

import java.util.LinkedList;

/**

 */
public class Solution1 {
    public int maxDepth(TreeNode root)  {
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

        // System.out.println("depth :" + depth);
        return depth - 1;

    }
}
