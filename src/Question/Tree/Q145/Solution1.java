/**
 145. 二叉树的后序遍历
 给定一个二叉树，返回它的 后序 遍历。

 示例:

 输入: [1,null,2,3]
 1
 \
 2
 /
 3

 输出: [3,2,1]
 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 */

package Question.Tree.Q145;

import Question.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**

 */
public class Solution1 {
        public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();

        LinkedList<TreeNode> stack = new LinkedList();

        stack.push(root);

        while ( !stack.isEmpty()) {
            TreeNode cur = stack.pop();
            result.add(cur.val);

            if (cur.right != null) {
                stack.push(cur.right);
            }

            if (cur.left != null) {
                stack.push(cur.left);
            }

        }

        System.out.println(result);
        return result;

    }
}
