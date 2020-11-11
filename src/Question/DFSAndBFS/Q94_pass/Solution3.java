/**
 94. 二叉树的中序遍历
 给定一个二叉树，返回它的中序 遍历。

 示例:

 输入: [1,null,2,3]
  1
    \
      2
    /
    3

 输出: [1,3,2]
 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 */

package Question.DFSAndBFS.Q94_pass;

import Question.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**

 */
public class Solution3 {
    public List<Integer> inorderTraversal(TreeNode root){


        List<Integer> result = new ArrayList<>();

        LinkedList<TreeNode> stack = new LinkedList<>();

        TreeNode cur = root;

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            result.add(cur.val);
            cur = cur.right;

        }

        System.out.println(result);
        return result;





    }
}
