package Question.Tree.Q105;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void buildTree() {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        new Solution1().buildTree(preorder,inorder);

    }
}