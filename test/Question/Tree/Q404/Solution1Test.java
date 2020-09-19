package Question.Tree.Q404;

import Question.Tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void sumOfLeftLeaves() {

        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        TreeNode node3 = new TreeNode(20,node4,node5);
        TreeNode node2 = new TreeNode(9);
        TreeNode node1 = new TreeNode(3,node2,node3);

        assertEquals(24, new Solution1().sumOfLeftLeaves(node1));

    }
}