package Question.Tree.Q235;

import Question.Tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void lowestCommonAncestor() {
        TreeNode node1 = new TreeNode(6);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(0);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(3);
        TreeNode node7 = new TreeNode(5);
        TreeNode node8 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node5.left = node6;
        node5.right = node7;

        node3.left = node8;
        node3.right = node9;

        new Solution1().lowestCommonAncestor(node1, node2, node3);
//        new Solution1().lowestCommonAncestor(node1, node2, node5);

    }
}