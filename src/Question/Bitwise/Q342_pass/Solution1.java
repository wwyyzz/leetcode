/**
 * 922. 按奇偶排序数组 II
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 * 你可以返回任何满足上述条件的数组作为答案。
 *
 * 示例：
 * 输入：[4,2,5,7]
 * 输出：[4,5,2,7]
 * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 *
 *
 * 提示：
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 */
package Question.Bitwise.Q342_pass;

/**
 *
 342. 4的幂
 给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。

 示例 1:

 输入: 16
 输出: true
 示例 2:

 输入: 5
 输出: false
 进阶：
 你能不使用循环或者递归来完成本题吗？
 */
/*

        4--1 (  4)： 100   (len=3)
        4--2 ( 16)： 10000 (len=5)
        4--3 ( 64)： 1000000 (len=7)
        4--4 (256)： 100000000 (len=9)
        4--5 (1024)：10000000000 (len=11)
*/

public class Solution1 {

    public boolean isPowerOfFour(int num) {
//        1、将num转为二进制数组
        System.out.println("bitCount = " + Integer.bitCount(num));
        String s = Integer.toBinaryString(num);

        System.out.println("index:" + s.indexOf('1'));
        System.out.println("lastindex: " + s.lastIndexOf('1'));

        System.out.println(s);

//        2、如果该数组只有一个1，且该1的位置为（1,3,5,7......25,27,29,31）,则为4的幂
        int index =  s.indexOf('1');
        int lastindex =  s.lastIndexOf('1');
        if ( ((s.length() - 1) % 2 == 0) && index == lastindex && index >= 0 ){
            return true;
        }else
        {return false;}

    }

}
