/**
 530. 二叉搜索树的最小绝对差
 给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。

 示例：
 输入：
    1
     \
     3
    /
   2

 输出：
 1
 解释：
 最小绝对差为 1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。

 提示：
 树中至少有 2 个节点。
 本题与 783 https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/ 相同
 */

package Question.Tree.Q530;

import Question.Tree.TreeNode;

import java.util.ArrayList;

/**
 优化有序数组的遍历
 执行用时：
 2 ms, 在所有 Java 提交中击败了32.89%的用户
 内存消耗：
 39.2 MB, 在所有 Java 提交中击败了23.69%的用户
 */
public class Solution2 {
    public int getMinimumDifference(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);

        int result = Integer.MAX_VALUE;
        for (int i = list.size() - 1; i > 0 ; i--) {
            if ((list.get(i) - list.get(i - 1)) < result) {
                result = list.get(i) - list.get(i - 1);
            }
        }

        return result;
    }

    private void inOrder(TreeNode node, ArrayList<Integer> list) {
        if (node == null) {
            return ;
        }

        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }
}
