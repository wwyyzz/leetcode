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

package Offer.Offer32_II_pass;

import Question.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**

 */
public class Solution1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (null == root) {
            return result;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
//        result.add(Arrays.asList(root.val));

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (null != node.left) {
                    queue.offer(node.left);
                }
                if (null != node.right) {
                    queue.offer(node.right);
                }

            }
            result.add(list);

        }

        // System.out.println("arrays :" + result);
        return result;

    }
}
