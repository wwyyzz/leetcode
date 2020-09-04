package Question.Tree.Q110;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void isBalanced() {
        TreeNode t1 = new TreeNode(3);
        TreeNode t21 = new TreeNode(9);
        TreeNode t22 = new TreeNode(20);
        TreeNode t31 = new TreeNode(20);
        TreeNode t32 = new TreeNode(20);

        t1.left = t21;
        t1.right = t22;

        t22.left = t31;
        t22.right = t32;

        assertTrue(new Solution1().isBalanced(t1));

    }

    @Test
    public void isBalanced2() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t21 = new TreeNode(2);
        TreeNode t22 = new TreeNode(2);
        TreeNode t31 = new TreeNode(3);
        TreeNode t32 = new TreeNode(3);
        TreeNode t41 = new TreeNode(4);
        TreeNode t42 = new TreeNode(4);

        t1.left = t21;
        t1.right = t22;

        t21.left = t31;
        t21.right = t32;

        t31.left = t41;
        t31.right = t42;


        assertEquals(false, new Solution1().isBalanced(t1));

    }

    @Test
    public void isBalanced3() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t21 = new TreeNode(3);
        TreeNode t31 = new TreeNode(2);


        t1.right = t21;
        t21.left = t31;

        assertEquals(false, new Solution1().isBalanced(t1));

    }
}