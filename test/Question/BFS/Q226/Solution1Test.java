package Question.BFS.Q226;

import Question.Tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void invertTree() {
//        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(3);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(9);
        TreeNode n2 = new TreeNode(2,null,n5);
        TreeNode n3 = new TreeNode(7,n6,n7);
        TreeNode n1 = new TreeNode(4, n2, n3);

//        new Solution1().invertTree(n1);


    }
}