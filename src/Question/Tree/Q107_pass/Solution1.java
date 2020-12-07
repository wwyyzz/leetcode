/**
 107. 二叉树的层次遍历 II
 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）

 例如：
 给定二叉树 [3,9,20,null,null,15,7],

   3
  / \
 9  20
   /  \
  15   7
 返回其自底向上的层次遍历为：

 [
 [15,7],
 [9,20],
 [3]
 ]
 */

package Question.Tree.Q107_pass;

import Question.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 执行用时：
 1 ms, 在所有 Java 提交中击败了98.36%的用户
 内存消耗：
 38.9 MB, 在所有 Java 提交中击败了57.07%的用户
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
            result.add(0,list);

        }

        System.out.println("arrays :" + result);
        return result;

    }
}


