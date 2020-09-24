/**
 501. 二叉搜索树中的众数
 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。

 假定 BST 有如下定义：

 结点左子树中所含结点的值小于等于当前结点的值
 结点右子树中所含结点的值大于等于当前结点的值
 左子树和右子树都是二叉搜索树
 例如：
 给定 BST [1,null,2,2],

    1
     \
     2
     /
    2
 返回[2].

 提示：如果众数超过1个，不需考虑输出顺序

 进阶：你可以不使用额外的空间吗？（假设由递归产生的隐式调用栈的开销不被计算在内）
 */

package Question.Tree.Q501_pass;

import Question.Tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**

 */
public class Solution1 {
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap();

        ArrayList<Integer> list = new ArrayList();

        find(root, list);
        for (Integer integer : list) {
            if (map.get(integer) == null) {
                map.put(integer, 1);
            } else {
                map.put(integer, map.get(integer) + 1);
            }
        }

        int max_value = 0;
        for (int i : map.values()) {
            if (i >= max_value) {
                max_value = i;
            }
        }

        ArrayList<Integer> max_list = new ArrayList();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max_value) {
                max_list.add(entry.getKey());
            }
        }

        System.out.println(max_list);

//        Object[] objects = max.keySet().toArray();
        int[] result = new int[max_list.size()];

        for (int i = 0; i < max_list.size(); i++) {
            result[i] = max_list.get(i);
        }

        System.out.println(Arrays.toString(result));
        return result;
    }

    private void find(TreeNode node,ArrayList list) {
        if (node == null) {
            return;
        }

        find(node.left, list);
        list.add(node.val);
        find(node.right, list);

    }
}
