/**
 剑指 Offer 32 - III. 从上到下打印二叉树 III
 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。

 例如:
 给定二叉树: [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
 返回其层次遍历结果：

 [
 [3],
 [20,9],
 [15,7]
 ]

 提示：
 节点总数 <= 1000
 */

package Offer.Offer32_III_pass;

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

        int level = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (level % 2 != 0) {
                    if (null != node.left) {
                        queue.offer(node.left);
                    }
                    if (null != node.right) {
                        queue.offer(node.right);
                    }
                } else {
                    if (null != node.right) {
                        queue.offer(node.right);
                    }
                    if (null != node.left) {
                        queue.offer(node.left);
                    }

                }


            }
            result.add(list);
            level++;

        }

        System.out.println("arrays :" + result);
        return result;

    }
}
