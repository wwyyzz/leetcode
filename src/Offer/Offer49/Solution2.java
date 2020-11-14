/**
 剑指 Offer 49. 丑数
 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。

 示例:
 输入: n = 10
 输出: 12
 解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。

 说明:  
 1 是丑数。
 n 不超过1690。
 注意：本题与主站 264 题相同：https://leetcode-cn.com/problems/ugly-number-ii/

 */

package Offer.Offer49;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**

 */
public class Solution2 {
    public int nthUglyNumber(int n){
        int count = 0;
        int num = 1;
        int ugly = 0;
        while (count < n) {
            if (isUgly(num)) {
                count++;
                ugly = num;
//                System.out.println("ugly   :" + ugly);
//                System.out.println("count  :" + count);
            }
            num++;
        }

//        System.out.println(ugly);
        return ugly;

    }

    private boolean isUgly(int num) {
//        System.out.println("num  :" + num);
        while (num % 2 == 0) {
            num /= 2;
        }

        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }

//        System.out.println("num  :" + num);
        return num == 1;
    }
}
