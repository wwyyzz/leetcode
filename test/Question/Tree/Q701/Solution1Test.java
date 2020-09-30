package Question.Tree.Q701;

import Question.Tree.TreeNode;
import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void insertIntoBST() {
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node2 = new TreeNode(7);
        TreeNode node1 = new TreeNode(2,node3,node4);
        TreeNode root = new TreeNode(4,node1, node2);


        new Solution1().insertIntoBST(root,5);
    }
}