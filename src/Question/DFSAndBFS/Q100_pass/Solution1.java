/**
 100. 相同的树
 给定两个二叉树，编写一个函数来检验它们是否相同。

 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。

 示例 1:

 输入:
  1         1
 / \       / \
 2   3    2   3

 [1,2,3],   [1,2,3]

 输出: true
 示例 2:

 输入:
  1          1
 /           \
 2             2

 [1,2],     [1,null,2]

 输出: false
 示例 3:

 输入:
   1         1
  / \       / \
 2   1     1   2

 [1,2,1],   [1,1,2]

 输出: false
 */

package Question.DFSAndBFS.Q100_pass;

import Question.Tree.TreeNode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**

 */
public class Solution1 {
    public boolean isSameTree(TreeNode p, TreeNode q){
        boolean result = true;

        List<Integer> list_p = inorderTraversal(p);
        List<Integer> list_q = inorderTraversal(q);

        for (int i = 0; i < list_p.size(); i++) {
            if (!list_p.get(i).equals(list_q.get(i))) {
                return false;
            }
        }

        return result;

    }

    private List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();

        LinkedList<TreeNode> stack = new LinkedList<>();

        TreeNode cur = root;

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            result.add(cur.val);
            cur = cur.right;

        }

        System.out.println(result);
        return result;

    }
}


