package Question.Tree.Q145;


import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void postorderTraversal() {
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

        new Solution1().postorderTraversal(root);
    }
}