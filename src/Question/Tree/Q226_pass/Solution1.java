/**
 226. 翻转二叉树
 翻转一棵二叉树。

 示例：

 输入：

      4
    /   \
   2     7
  / \   / \
 1   3 6   9
 输出：

     4
    /   \
   7     2
  / \   / \
 9   6 3   1
 备注:
 这个问题是受到 Max Howell 的 原问题 启发的 ：

 谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。
 */

package Question.Tree.Q226_pass;

import Question.Tree.TreeNode;

import java.util.LinkedList;

/**
 执行用时：
 0 ms, 在所有 Java 提交中击败了100.00%的用户
 内存消耗：
 36.3 MB, 在所有 Java 提交中击败了72.56%的用户
 */
public class Solution1 {
    public TreeNode invertTree(TreeNode root){
        if (root == null) {
            return null;
        }
        TreeNode result = new TreeNode();

        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left != null || poll.right != null ) {
                    TreeNode tmp = poll.left;
                    poll.left = poll.right;
                    poll.right = tmp;

                    if (poll.left != null) {
                        queue.add(poll.left);
                    }
                    if (poll.right != null){
                        queue.add(poll.right);
                    }
                }

            }
        }

        System.out.println(root);

        return result;

    }
}
