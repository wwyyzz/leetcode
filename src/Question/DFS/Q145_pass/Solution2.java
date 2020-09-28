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

package Question.DFS.Q145_pass;

import Question.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 37.3 MB, 在所有 Java 提交中击败了10.79%的用户
 */
public class Solution2 {
        public List<Integer> postorderTraversal(TreeNode root){

            ArrayList<Integer> result = new ArrayList<>();

            postorder(root, result);

            System.out.println(result);
            return result;

        }

    private void postorder(TreeNode node, ArrayList list) {
        if (node == null) {
            return;
        }

        postorder(node.left, list);
        postorder(node.right,list);
        list.add(node.val);
    }


}
