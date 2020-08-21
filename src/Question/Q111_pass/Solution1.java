/**
 111. 二叉树的最小深度
 给定一个二叉树，找出其最小深度。

 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。

 说明: 叶子节点是指没有子节点的节点。

 示例:

 给定二叉树 [3,9,20,null,null,15,7],

   3
 /  \
 9  20
   /  \
  15   7
 返回它的最小深度  2.
 */

package Question.Q111_pass;

import java.util.LinkedList;

/**
 41 / 41 个通过测试用例
 状态：通过
 执行用时：1 ms
 内存消耗：39.9 MB
 */
public class Solution1 {
    public int minDepth(TreeNode root) {
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
                if (null == node.left && null == node.right) {
                    return depth;
                }

                if (null != node.left) {
                    queue.offer(node.left);
                }
                if (null != node.right) {
                    queue.offer(node.right);
                }

            }
            depth++;
        }

        return depth;

    }
}
