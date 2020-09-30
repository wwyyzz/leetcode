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
import java.util.LinkedList;
import java.util.List;

/**
 执行用时：
 14 ms, 在所有 Java 提交中击败了7.06%的用户
 内存消耗：
 39.4 MB, 在所有 Java 提交中击败了5.14%的用户
 */
public class Solution1 {
    public List<String> binaryTreePaths(TreeNode root){

        ArrayList<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        ArrayList<ArrayList<TreeNode>> result_list = new ArrayList<>();

        LinkedList<ArrayList<TreeNode>> stack = new LinkedList<>();

        ArrayList<TreeNode> list = new ArrayList<>();
        list.add(root);

        stack.push(list);

        while (!stack.isEmpty()) {
            int size = stack.size();

            for (int i = 0; i < size; i++) {
                ArrayList<TreeNode> pop = stack.pop();
                TreeNode last = pop.get(pop.size() - 1);
                if (last.left == null && last.right == null) {
                    result_list.add(pop);
                }
                if (last.left != null) {
                    ArrayList<TreeNode> add_left = new ArrayList<>(pop);
                    add_left.add(last.left);
                    stack.push(add_left);
                }

                if (last.right != null) {
                    ArrayList<TreeNode> add_right = new ArrayList<>(pop);
                    add_right.add(last.right);
                    stack.push(add_right);
                }

            }
        }

        System.out.println(result_list.toString());
        for (ArrayList<TreeNode> nodes_list : result_list) {
            StringBuilder sb = new StringBuilder(nodes_list.get(0).val + "");
            for (int i = 1; i < nodes_list.size(); i++) {
                sb.append("->").append(nodes_list.get(i).val);
            }
            result.add(sb.toString());
        }

        System.out.println(result);

        return result;

    }
}
