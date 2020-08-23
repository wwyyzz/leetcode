package Question.array.Q896;

/**
 * @program: leetcode
 * @description: Question.array.Q896
 * @author: Jun Wang
 * @create: 2018-12-14 17:09
 */

/**
 896. 单调数列
 如果数组是单调递增或单调递减的，那么它是单调的。

 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。

 当给定的数组 A 是单调数组时返回 true，否则返回 false。

 示例 1：
 输入：[1,2,2,3]
 输出：true

 示例 2：
 输入：[6,5,4,4]
 输出：true

 示例 3：
 输入：[1,3,2]
 输出：false

 示例 4：
 输入：[1,2,4,5]
 输出：true

 示例 5：
 输入：[1,1,1]
 输出：true

 提示：
 1 <= A.length <= 50000
 -100000 <= A[i] <= 100000
 */
public class Solution1 {
    public boolean isMonotonic(int[] A) {

//        两次遍历，判断后一个是否大于或者小于前一个
//        遍历数组
//          如果（A[i] 始终>= A[i+1]）则true
        for (int i = 0; i < A.length; i++) {
//            if (A[i] >= A[i+])
            
        }
//        遍历数组
//          如果（A[i] 始终<= A[i+1]）则true
        return true;
    }
}
