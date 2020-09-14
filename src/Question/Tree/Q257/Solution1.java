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

import java.util.*;

/**

 */
public class Solution1 {
    public List<String> binaryTreePaths(TreeNode root){
        List<String> result = new ArrayList<>();
        List<ArrayList> result_list = new ArrayList<>();

        LinkedList<ArrayList> queue = new LinkedList();
        ArrayList<TreeNode> list = new ArrayList();
        list.add(root);
        queue.add(list);

        while (!queue.isEmpty()) {

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                ArrayList<TreeNode> tmp = new ArrayList<>();
                tmp = queue.poll();
                int len = tmp.size();
                TreeNode node = tmp.get(len - 1);
                StringBuilder sb = new StringBuilder(node.val);
//                sb = "" + node.val;
                if (node.left == null && node.right == null) {
                    result_list.add(tmp);
                    continue;
                }
                if (node.left != null) {
                    tmp.add(node.left);
                    queue.add(tmp);
                }
                if (node.right != null) {
                    tmp.add(node.right);
                    queue.add(tmp);
                }

            }
        }

        System.out.println();

        return result;

    }
}
