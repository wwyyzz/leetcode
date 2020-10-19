package Question.Tree.Q98_pass;

import Question.Tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isValidBST() {

        TreeNode n5 = new TreeNode(6);
        TreeNode n4 = new TreeNode(3);
        TreeNode n3 = new TreeNode(4, n4, n5);
        TreeNode n2 = new TreeNode(1);
        TreeNode n1 = new TreeNode(5, n2, n3);

        assertFalse(new Solution1().isValidBST(n1));
    }

    @Test
    public void isValidBST2() {


        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(1);
        TreeNode n1 = new TreeNode(2, n2, n3);

        assertTrue(new Solution1().isValidBST(n1));
    }

    @Test
    public void isValidBST3() {
        TreeNode n2 = new TreeNode(1);
        TreeNode n1 = new TreeNode(1, n2,null);
        assertFalse(new Solution1().isValidBST(n1));
    }

    @Test
    public void isValidBST4() {
        TreeNode n3 = new TreeNode(2147483647);
        TreeNode n1 = new TreeNode(-2147483648, null,n3);
        assertTrue(new Solution1().isValidBST(n1));
    }
}