package Question.Tree.Q257;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void binaryTreePaths() {
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);

        root.left = n1;
        root.right = n2;
        n1.right = n5;

        new Solution1().binaryTreePaths(root);
    }
}