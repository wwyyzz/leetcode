package Question.Tree.Q236;

import Question.Tree.TreeNode;
import Question.Util.trnsform;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void lowestCommonAncestor() {
        int[] root = {3,5,1,6,2,0,8,Integer.MAX_VALUE, Integer.MAX_VALUE,7,4};

        TreeNode head = new trnsform().arrayToTree(root);

//        assertEquals(3, new Solution1().lowestCommonAncestor(head, 5, 1));
    }
}