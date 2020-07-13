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
package Question.Q922;

import java.util.ArrayList;

/**
 *
 61 / 61 个通过测试用例
 状态：通过
 执行用时：12 ms

 我的提交执行用时
 已经战胜 41.52 % 的 java 提交记录
 */
public class Solution1 {
    public int[] sortArrayByParityII(int[] A) {
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

//        使用for遍历A
        for (int i = 0; i < A.length; i++) {
//                将奇数保存到oddList
            if (A[i] % 2 == 0){
                evenList.add(A[i]);
            } else {
                oddList.add(A[i]);
            }
//                将偶数保存到evenList
        }
//


//        使用for遍历evenList
//                将元素赋值给A的偶数index
        //        使用for遍历oddList
//                将元素赋值给A的奇数index
        for (int i = 0; i < A.length / 2; i++) {
            A[i * 2] = evenList.get(i);
            A[i * 2 + 1] = oddList.get(i);
        }

        return A;
    }
}
