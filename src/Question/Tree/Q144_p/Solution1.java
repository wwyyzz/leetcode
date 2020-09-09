/**
 144. 二叉树的前序遍历
 给定一个二叉树，返回它的 前序 遍历。

 示例:

 输入: [1,null,2,3]
 1
  \
   2
  /
 3

 输出: [1,2,3]
 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 */

package Question.Tree.Q144_p;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**

 */
public class Solution1 {
    public List<Integer> preorderTraversal(TreeNode root){
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
