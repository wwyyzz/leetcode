/**
 75. 颜色分类
 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。

 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。

 注意:
 不能使用代码库中的排序函数来解决这道题。

 示例:

 输入: [2,0,2,1,1,0]
 输出: [0,0,1,1,2,2]
 进阶：

 一个直观的解决方案是使用计数排序的两趟扫描算法。
 首先，迭代计算出0、1 和 2 元素的个数，然后按照0、1、2的排序，重写当前数组。
 你能想出一个仅使用常数空间的一趟扫描算法吗？
 */

package Question.Array.Q75;

import java.util.Arrays;
import java.util.HashMap;

/**

 */
public class Solution3 {
    public void sortColors(int[] nums){
        if (nums.length == 1) {
            return;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        Arrays.fill(nums,0,map.get(0)-1,0);
        Arrays.fill(nums,map.get(0),map.get(0) + map.get(1) -1,1);
        Arrays.fill(nums,map.get(0) + map.get(1),nums.length,2);


        System.out.println(Arrays.toString(nums));

    }
}
