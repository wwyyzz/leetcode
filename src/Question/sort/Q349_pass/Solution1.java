/**
 349. 两个数组的交集
 给定两个数组，编写一个函数来计算它们的交集。



 示例 1：

 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 输出：[2]
 示例 2：

 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 输出：[9,4]


 说明：

 输出结果中的每个元素一定是唯一的。
 我们可以不考虑输出结果的顺序。
 */

package Question.sort.Q349_pass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 执行用时：
 4 ms
 , 在所有 Java 提交中击败了
 51.37%
 的用户
 内存消耗：
 39.3 MB
 , 在所有 Java 提交中击败了
 5.72%
 的用户
 */
public class Solution1 {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    set.add(i);
                    break;
                }
            }
        }



        int[] result = new int[set.size()];


        Iterator<Integer> iterator = set.iterator();
        for (int i = 0; i < result.length; i++) {
            result[i] = iterator.next();
        }

//        int i = 0;
//        while (set.iterator().hasNext()){
//            result[i] = set.iterator().next();
//            i++;
//        }

        System.out.println(Arrays.toString(result));

        return result;

    }
}
