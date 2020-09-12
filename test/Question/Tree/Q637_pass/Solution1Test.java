package Question.Tree.Q637_pass;

import junit.framework.TestCase;

public class Solution1Test extends TestCase {

    public void testAverageOfLevels() {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        new Solution1().averageOfLevels(root);

    }
}