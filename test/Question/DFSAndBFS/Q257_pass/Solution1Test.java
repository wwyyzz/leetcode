package Question.DFSAndBFS.Q257_pass;

import Question.Tree.TreeNode;
import org.junit.Test;

public class Solution1Test {

    @Test
    public void binaryTreePaths() {
        TreeNode node4 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2,null,node4);
        TreeNode node1 = new TreeNode(1,node2, node3);

        new Solution1().binaryTreePaths(node1);
    }
}