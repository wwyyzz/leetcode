/**
 961. 重复 N 次的元素
 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。

 返回重复了 N 次的那个元素。

 示例 1：
 输入：[1,2,3,3]
 输出：3

 示例 2：
 输入：[2,1,2,5,3,2]
 输出：2

 示例 3：
 输入：[5,1,5,2,5,3,5,4]
 输出：5

 提示：
 4 <= A.length <= 10000
 0 <= A[i] < 10000
 A.length 为偶数
 */

package Question.HashTable.Q961_pass;

import java.util.HashMap;
import java.util.Map;

/**
 执行用时：
 1 ms, 在所有 Java 提交中击败了74.22%的用户
 内存消耗：
 40.7 MB, 在所有 Java 提交中击败了54.56%的用户
 */
public class Solution1 {
    public int repeatedNTimes(int[] A){
        int result = 0;

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                result = A[i];
                break;
            } else {
                map.put(A[i], 1);
            }
        }

        return result;

    }
}
