package Question.Tree.Q222;

import Question.Tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void countNodes() {

        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);


        TreeNode n2 = new TreeNode(2,n4,n5);
        TreeNode n3 = new TreeNode(3,n6,null);

        TreeNode n1 = new TreeNode(1,n2,n3);

        assertEquals(6, new Solution1().countNodes(n1));

    }
}