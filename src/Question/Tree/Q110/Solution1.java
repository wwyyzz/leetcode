/**
 110. 平衡二叉树
 给定一个二叉树，判断它是否是高度平衡的二叉树。

 本题中，一棵高度平衡二叉树定义为：

 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。

 示例 1:

 给定二叉树 [3,9,20,null,null,15,7]

 3
 / \
 9  20
 /  \
 15   7
 返回 true 。

 示例 2:

 给定二叉树 [1,2,2,3,3,null,null,4,4]

 1
 / \
 2   2
 / \
 3   3
 / \
 4   4
 返回 false 。
 */

package Question.Tree.Q110;

import Question.Tree.TreeNode;

/**

 */
public class Solution1 {
    public boolean isBalanced(TreeNode root){
        if(root == null) {
            return true;
        }

        boolean result = true;

        int left = 0;
        int right = 0;

        TreeNode l_node = root;
        while (l_node.left != null || l_node.right != null) {
            left++;
            l_node = l_node.left;

        }

        TreeNode r_node = root;
        while (r_node.right != null|| r_node.left != null) {
            right++;
            r_node = r_node.right;
        }

        System.out.println(left);
        System.out.println(right);

        return (Math.abs(left - right)) <= 1;

    }
}
