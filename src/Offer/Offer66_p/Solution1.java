/**
 剑指 Offer 66. 构建乘积数组
 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，
 其中 B 中的元素 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
  
 示例:

 输入: [1,2,3,4,5]
 输出: [120,60,40,30,24]

 提示：
 所有元素乘积之和不会溢出 32 位整数
 a.length <= 100000

 */

package Offer.Offer66_p;

import java.util.Arrays;

/**

 */
public class Solution1 {
    public int[] constructArr(int[] a){
        int[] result = new int[a.length];

        int multi = 1;


        for (int i = 0; i < a.length; i++) {
            multi = 1;
            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    multi *= a[j];
                }
            }
            result[i] = multi;
        }

        System.out.println(Arrays.toString(result));
        return result;
    }
}
