/**
 1299. 将每个元素替换为右侧最大元素
 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。

 完成所有替换操作后，请你返回这个数组。

 示例：

 输入：arr = [17,18,5,4,6,1]
 输出：[18,6,6,6,1,-1]

 提示：
 1 <= arr.length <= 10^4
 1 <= arr[i] <= 10^5
 */

package Question.array.Q1299_pass;

import java.util.Arrays;

/**

 15 / 15 个通过测试用例
 状态：通过
 执行用时：2 ms
 内存消耗：41.3 MB
 */
public class Solution1 {
    public int[] replaceElements(int[] arr){
        int[] result = new int[arr.length];

        int len = arr.length;

        result[len - 1] = -1;
        if (len == 1){
            return result;
        }
        result[len - 2] = arr[len - 1];

        int max = arr[len - 1];
        for (int i = len - 3; i >=0 ; i--) {
            max = Math.max(max, arr[i + 1]);
            result[i] = max;
        }

        System.out.println(Arrays.toString(result));

        return result;

    }
}
