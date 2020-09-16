package Question.Tree.Q226;

import Question.Tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void invertTree() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(2,node1,node2);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(9);
        TreeNode node6 = new TreeNode(7,node4,node5);
        TreeNode root = new TreeNode(4,node3,node6);

        new Solution1().invertTree(root);
    }

    @Test
    public void invertTree2() {

        TreeNode root = new TreeNode();

        new Solution1().invertTree(root);
    }
}