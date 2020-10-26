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

package Question.DFS.Q100_pass;

import Question.Tree.TreeNode;

import java.util.LinkedList;

/**
 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 36.7 MB, 在所有 Java 提交中击败了5.15%的用户
 */
public class Solution2 {
    public boolean isSameTree(TreeNode p, TreeNode q){
        boolean result = true;
        if (p == null ) {
            return q == null;
        }

        if (q == null ) {
            return p == null;
        }

        LinkedList<TreeNode> s1 = new LinkedList<>();
        LinkedList<TreeNode> s2 = new LinkedList<>();

        s1.push(p);
        s2.push(q);

        while (!s1.isEmpty() && !s2.isEmpty()) {
            int size = s1.size();

            for (int i = 0; i < size; i++) {
                TreeNode node_s1 = s1.pop();
                TreeNode node_s2 = s2.pop();
                if (node_s1.val == node_s2.val) {
                    if (node_s1.left != null && node_s2.left != null) {
                        s1.push(node_s1.left);
                        s2.push(node_s2.left);

                    }else if (node_s1.left == null && node_s2.left == null){
                        result = true;
                    }else {
                        return false;
                    }

                    if (node_s1.right != null && node_s2.right != null) {
                        s1.push(node_s1.right);
                        s2.push(node_s2.right);

                    } else if (node_s1.right == null && node_s2.right == null){
                        result = true;
                    }else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return result;

    }


}


