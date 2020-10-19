/**
 257. 二叉树的所有路径
 给定一个二叉树，返回所有从根节点到叶子节点的路径。

 说明: 叶子节点是指没有子节点的节点。

 示例:

 输入:

    1
  /   \
 2     3
  \
   5

 输出: ["1->2->5", "1->3"]

 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 */

package Question.DFS.Q257_pass;

import Question.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 执行用时：
 14 ms, 在所有 Java 提交中击败了7.06%的用户
 内存消耗：
 39.4 MB, 在所有 Java 提交中击败了5.14%的用户
 */
public class Solution2 {
    public List<String> binaryTreePaths(TreeNode root){

        ArrayList<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        travel(root, "",result);
        System.out.println(result);
        return result;

    }

    private void travel(TreeNode root, String curPath, ArrayList result) {
        if (root == null) {
            return;
        }

        StringBuilder sb = new StringBuilder(curPath);
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            result.add(sb);
        } else {
            sb.append("->");
            travel(root.left, sb.toString(),result);
            travel(root.right, sb.toString(),result);
        }

    }
}
