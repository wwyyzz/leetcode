/**
 98. 验证二叉搜索树
 给定一个二叉树，判断其是否是一个有效的二叉搜索树。

 假设一个二叉搜索树具有如下特征：
 节点的左子树只包含小于当前节点的数。
 节点的右子树只包含大于当前节点的数。
 所有左子树和右子树自身必须也是二叉搜索树。

 示例 1:
 输入:
    2
   / \
 1   3
 输出: true

 示例 2:
 输入:
     5
    / \
   1   4
  / \
 3   6
 输出: false
 解释: 输入为: [5,1,4,null,null,3,6]。
 根节点的值为 5 ，但是其右子节点值为 4 。
 */

package Question.Tree.Q98_pass;

import Question.Tree.TreeNode;

import java.util.ArrayList;

/**
 基于方法一中提及的性质，我们可以进一步知道二叉搜索树「中序遍历」得到的值构成的序列一定是升序的，
 这启示我们在中序遍历的时候实时检查当前节点的值是否大于前一个中序遍历到的节点的值即可。
 如果均大于说明这个序列是升序的，整棵树是二叉搜索树，否则不是，下面的代码我们使用栈来模拟中序遍历的过程。

 执行用时：
 2 ms, 在所有 Java 提交中击败了31.63%的用户
 内存消耗：
 38.1 MB, 在所有 Java 提交中击败了99.35%的用户
 */
public class Solution1 {
    public boolean isValidBST(TreeNode root) {
        boolean result = true;
        ArrayList<Integer> list = new ArrayList<>();

        postOrder(root, list);
        System.out.println(list);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return  result;

    }

    private void postOrder(TreeNode node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }

        postOrder(node.left,list);
        list.add(node.val);
        postOrder(node.right,list);

    }
}
