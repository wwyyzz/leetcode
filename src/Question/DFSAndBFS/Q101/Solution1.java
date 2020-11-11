/**
 101. 对称二叉树
 给定一个二叉树，检查它是否是镜像对称的。



 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

     1
    / \
   2   2
  / \ / \
 3  4 4  3


 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

    1
   / \
  2   2
  \    \
   3    3


 进阶：

 你可以运用递归和迭代两种方法解决这个问题吗？
 */

package Question.DFSAndBFS.Q101;

import Question.Tree.TreeNode;

import java.util.ArrayList;

/**

 */
public class Solution1 {
    public boolean isSymmetric(TreeNode root){
        ArrayList list = new ArrayList();
        inOrder(root, list);

        System.out.println(list);

        for (int i = 0; i < (list.size() / 2); i++) {
            if (list.get(i) != list.get(list.size() - 1 - i)) {
                return false;
            }
        }

        return true;

    }

    private void inOrder(TreeNode node, ArrayList list) {
        if (node == null) {
            return;
        }

        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }
}
