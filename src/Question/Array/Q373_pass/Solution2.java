/**
 373. 查找和最小的K对数字
 给定两个以升序排列的整形数组 nums1 和 nums2, 以及一个整数 k。

 定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2。

 找到和最小的 k 对数字 (u1,v1), (u2,v2) ... (uk,vk)。

 示例 1:
 输入: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
 输出: [1,2],[1,4],[1,6]
 解释: 返回序列中的前 3 对数：
 [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]

 示例 2:
 输入: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
 输出: [1,1],[1,1]
 解释: 返回序列中的前 2 对数：
 [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]

 示例 3:
 输入: nums1 = [1,2], nums2 = [3], k = 3
 输出: [1,3],[2,3]
 解释: 也可能序列中所有的数对都被返回:[1,3],[2,3]
 */

package Question.Array.Q373_pass;

import java.util.*;

/**
 执行用时：
 236 ms, 在所有 Java 提交中击败了10.47%的用户
 内存消耗：
 144.9 MB, 在所有 Java 提交中击败了5.13%
 的用户

 */
public class Solution2 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> u_v = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();

        for (int i : nums1) {
            for (int j : nums2) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(j);
                u_v.add(list);
                sum.add(i + j);
            }
        }

        if (k > sum.size()) {
            return u_v;
        }
//        System.out.println(sum);
//        这一段的效率太低，需要优化
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sum.size(); i++) {
            map.put(i, sum.get(i));
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Comparator.comparing(Map.Entry::getValue));


        for (int i = 0; i < k; i++) {
            result.add(u_v.get(list.get(i).getKey()));
        }


//        System.out.println(result);
        return result;

    }
}
