package Question.Util;

import Question.Tree.TreeNode;

public class trnsform {


    public static void main(String[] args) {
        int[] root = {3,5,1,6,2,0,8,Integer.MAX_VALUE,Integer.MAX_VALUE,7,4};
//        arrayToTree(root);

        System.out.println();
    }

    /**
     * 给定如下二叉树:  root = [3,5,1,6,2,0,8,Int,null,7,4]
     *
     */
    public TreeNode arrayToTree(int[] root) {
        TreeNode[] nodes = new TreeNode[root.length];

        for (int i = 0; i < root.length; i++) {
            TreeNode node = new TreeNode();
            if (root[i] == Integer.MAX_VALUE) {
                nodes[i] = null;
            }else{
                node.val = root[i];
                nodes[i] = node;
            }

        }

        int i = 0;
        int j = 1;

        while (j < nodes.length) {
            nodes[i].left = nodes[j];
            nodes[i].right = nodes[j + 1];
            i++;
            j += 2;
        }


        return nodes[0];
    }

}
