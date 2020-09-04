/**
 257. 二叉树的所有路径
 给定一个二叉树，返回所有从根节点到叶子节点的路径。

 说明: 叶子节点是指没有子节点的节点。

 示例:

 输入:

   1
 /   \
 2     3
 \
 5

 输出: ["1->2->5", "1->3"]

 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 */

package Question.Tree.Q257;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**

 */
public class Solution1 {
    public List<String> binaryTreePaths(TreeNode root){
        List<String> result = new ArrayList<>();

        LinkedList<TreeNode> queue = new LinkedList();
        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                StringBuilder sb = new StringBuilder(node.val);
//                sb = "" + node.val;
                if (node.left == null && node.right == null) {
                    result.add("" + node.val);
                    continue;
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }

            }
        }

        System.out.println(result);

        return result;

    }
}
