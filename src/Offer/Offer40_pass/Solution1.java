/**
 剑指 Offer 40. 最小的k个数
 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。

 示例 1：
 输入：arr = [3,2,1], k = 2
 输出：[1,2] 或者 [2,1]

 示例 2：
 输入：arr = [0,1,2,1], k = 1
 输出：[0]

 限制：
 0 <= k <= arr.length <= 10000
 0 <= arr[i] <= 10000
 */

package Offer.Offer40_pass;

import java.util.Arrays;

/**
 执行用时：
 7 ms, 在所有 Java 提交中击败了69.31%的用户
 内存消耗：
 39.9 MB, 在所有 Java 提交中击败了87.74%的用户
 */
public class Solution1 {
    public int[] getLeastNumbers(int[] arr, int k){
        int[] result = new int[k];

        Arrays.sort(arr);


        System.arraycopy(arr, 0, result, 0, k);

        System.out.println(Arrays.toString(result));

        return result;

    }
}
