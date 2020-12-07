package Question.Tree.Q107_pass;

import Question.Tree.TreeNode;
import org.junit.Test;

public class Solution1Test {

    @Test
    public void levelOrder() {
        TreeNode left2 = new TreeNode(9);
        TreeNode right2 = new TreeNode(20);

        TreeNode root = new TreeNode(3);
        root.left = left2;
        root.right = right2;

        TreeNode left3 = new TreeNode(15);
        TreeNode right3 = new TreeNode(7);
        right2.left = left3;
        right2.right = right3;

        new Solution1().levelOrder(root);
    }
}