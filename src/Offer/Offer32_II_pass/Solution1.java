/**
 102. 二叉树的层序遍历
 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。

 示例：
 二叉树：[3,9,20,null,null,15,7],

   3
  / \
 9  20
   /  \
  15   7
 返回其层次遍历结果：

 [
 [3],
 [9,20],
 [15,7]
 ]
 通过次数
 */

package Offer.Offer32_II_pass;

import Question.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 34 / 34 个通过测试用例
 状态：通过
 执行用时：1 ms
 内存消耗：39.7 MB
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

        System.out.println("arrays :" + result);
        return result;

    }
}


