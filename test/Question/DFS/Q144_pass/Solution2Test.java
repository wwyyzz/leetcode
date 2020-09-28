package Question.DFS.Q144_pass;

import Question.Tree.TreeNode;
import org.junit.Test;

public class Solution2Test {

    /**
     *              1
     *           /    \
     *          2     3
     *        /   \   /
     *       4    5  6
     *
     *    124536
     */

    @Test
    public void preorderTraversal() {
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

        new Solution2().preorderTraversal(root);
    }


}