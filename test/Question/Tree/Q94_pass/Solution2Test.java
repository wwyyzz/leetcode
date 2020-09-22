package Question.Tree.Q94_pass;

import Question.Tree.TreeNode;
import org.junit.Test;

public class Solution2Test {

    @Test
    public void inorderTraversal() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);

        root.right = node1;
        node1.left = node2;

        new Solution2().inorderTraversal(root);

    }

    /**
     *              1
     *           /    \
     *          2     3
     *        /   \   /
     *       4    5  6
     *
     * 425163
     */

    @Test
    public void inorderTraversal2() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;

        new Solution2().inorderTraversal(root);

    }
}