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
 注意是二叉搜索树, 二叉搜索树可是有序的。

 遇到在二叉搜索树上求什么最值啊，差值之类的，就把它想成在一个有序数组上求最值，求差值，这样就简单多了。

 执行用时：
 2 ms, 在所有 Java 提交中击败了32.89%的用户
 内存消耗：
 38.8 MB, 在所有 Java 提交中击败了33.69%的用户
 */
public class Solution1 {
    public int getMinimumDifference(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);

        int result;
        int first = 0;
        int second = 1;
        result = list.get(1) - list.get(0);
        while (first < (list.size() - 1)) {
            if ((list.get(second) - list.get(first)) < result) {
                result = list.get(second) - list.get(first);
            }

            first++;
            second++;
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
