/**
 941. 有效的山脉数组
 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：

 A.length >= 3
 在 0 < i < A.length - 1 条件下，存在 i 使得：
 A[0] < A[1] < ... A[i-1] < A[i]
 A[i] > A[i+1] > ... > A[A.length - 1]

 示例 1：
 输入：[2,1]
 输出：false

 示例 2：
 输入：[3,5,5]
 输出：false

 示例 3：
 输入：[0,3,2,1]
 输出：true

 提示：
 0 <= A.length <= 10000
 0 <= A[i] <= 10000
 */

package Question.Array.Q941_pass;

/**
 执行用时：
 2 ms, 在所有 Java 提交中击败了41.65%的用户
 内存消耗：
 39.9 MB, 在所有 Java 提交中击败了9.79%的用户
 */
public class Solution2 {
    public boolean validMountainArray(int[] A) {

        if (A.length < 3) {
            return false;
        }
        int L = 0;
        while (L < (A.length - 1)  && A[L] < A[L + 1]) {
            L++;
        }

        int R = A.length - 1;
        while (R > 0 && A[R - 1] > A[R]) {
            R--;
        }

        System.out.println("L    :" + L);
        System.out.println("R    :" + R);

        if (L == A.length || R == 0) {
            return false;
        }

        return  L > 0 && R < (A.length -1) && L == R;

    }
}
