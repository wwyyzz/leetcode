package Question.Tree.Q501_pass;

import Question.Tree.TreeNode;
import org.junit.Test;

public class Solution1Test {

    @Test
    public void findMode() {
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);

        TreeNode root = new TreeNode(1);

        root.right = node1;
        node1.left = node2;

        new Solution1().findMode(root);
    }
}