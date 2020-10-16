/**
 面试题 10.01. 合并排序的数组
 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。

 初始化 A 和 B 的元素数量分别为 m 和 n。

 示例:
 输入:
 A = [1,2,3,0,0,0], m = 3
 B = [2,5,6],       n = 3

 输出: [1,2,2,3,5,6]
 说明:

 A.length == n + m
 */

package Interview.Q1001_pass;

import java.util.Arrays;

/**
 执行用时：
 1 ms, 在所有 Java 提交中击败了24.80%的用户
 内存消耗：
 38.6 MB, 在所有 Java 提交中击败了91.96%的用户
 */
public class Solution1 {
    public void merge(int[] A, int m, int[] B, int n){

        System.arraycopy(B, 0, A, m, n);

        Arrays.sort(A);

        System.out.println(Arrays.toString(A));

    }
}
