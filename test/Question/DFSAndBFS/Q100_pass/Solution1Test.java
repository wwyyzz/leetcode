package Question.DFSAndBFS.Q100_pass;

import Question.Tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isSameTree() {
        TreeNode p1 = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = new TreeNode(3);

        TreeNode q1 = new TreeNode(1);
        TreeNode q2 = new TreeNode(3);
        TreeNode q3 = new TreeNode(2);

        p1.left = p2;
        p1.right = p3;

        q1.left = q2;
        q1.right = q3;

        assertEquals(false,new Solution1().isSameTree(p1,q1));
    }

    @Test
    public void isSameTree2() {
        TreeNode p1 = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = new TreeNode(3);

        TreeNode q1 = new TreeNode(1);
        TreeNode q2 = new TreeNode(2);
        TreeNode q3 = new TreeNode(3);

        p1.left = p2;
        p1.right = p3;

        q1.left = q2;
        q1.right = q3;

        assertEquals(true,new Solution1().isSameTree(p1,q1));
    }

    @Test
    public void isSameTree3() {
        TreeNode p1 = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);


        TreeNode q1 = new TreeNode(1);
        TreeNode q2 = new TreeNode(2);

        p1.left = p2;

        q1.right = q2;

        assertEquals(false,new Solution1().isSameTree(p1,q1));
    }
}