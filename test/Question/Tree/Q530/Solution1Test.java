package Question.Tree.Q530;

import Question.Tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void getMinimumDifference() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(2);

        n1.right = n2;
        n2.left = n3;

        assertEquals(1, new Solution1().getMinimumDifference(n1));
    }
}