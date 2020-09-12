/**
 637. 二叉树的层平均值
 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。


 示例 1：

 输入：
      3
     / \
    9  20
      /  \
     15   7
 输出：[3, 14.5, 11]
 解释：
 第 0 层的平均值是 3 ,  第1层是 14.5 , 第2层是 11 。因此返回 [3, 14.5, 11] 。


 提示：

 节点值的范围在32位有符号整数范围内。
 */

package Question.Tree.Q637_pass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 执行用时：
 2 ms, 在所有 Java 提交中击败了99.17%的用户
 内存消耗：
 41.1 MB, 在所有 Java 提交中击败了95.54%的用户
 */
public class Solution1 {
    public List<Double> averageOfLevels(TreeNode root){
        List<Double> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList();

        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0.0;
            double avg = 0.0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }

            }

            avg = sum  / size * 1.0;
            result.add(avg);
        }

        System.out.println(result);
        return result;

    }
}
