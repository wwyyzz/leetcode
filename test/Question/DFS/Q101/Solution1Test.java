package Question.DFS.Q101;

import Question.Tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isSymmetric() {
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(3);


        TreeNode node2 = new TreeNode(2,node4,node5);
        TreeNode node3 = new TreeNode(2,node6, node7);
        TreeNode node1 = new TreeNode(1,node2,node3);

        assertEquals(true, new Solution1().isSymmetric(node1));

    }

    @Test
    public void isSymmetric2() {
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(3);



        TreeNode node2 = new TreeNode(2,null,node4);
        TreeNode node3 = new TreeNode(2,null, node5);
        TreeNode node1 = new TreeNode(1,node2,node3);

        assertEquals(false, new Solution1().isSymmetric(node1));

    }

}