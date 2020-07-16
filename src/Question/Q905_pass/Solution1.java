/**
 * 905. 按奇偶排序数组
 * 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
 * 你可以返回满足此条件的任何数组作为答案。
 *
 * 示例：
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 *
 * 提示：
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 */

package Question.Q905_pass;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution1 {
    public int[] sortArrayByParity(int[] A) {
//        使用for遍历数组，设置前后两个指针i和j
        for (int i = 0, j = A.length - 1; i <= j;i++,j--) {
            //        如果i为偶数，i继续后移
            System.out.println("i=" + i + " j=" + j);
            while (i < A.length -1 &&A[i] % 2 == 0 ){
                i++;
            }
            System.out.println(A[i]);
//        如果j为奇数，则j继续前移
            while ( j > 0 && A[j] % 2 != 0 ){
                j--;
            }
            System.out.println(A[j]);
//        如果i为奇数，且j为偶数则交换

            if ((A[i] % 2 != 0 )&& (A[j] % 2 == 0)) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
//                i++;
//                j--;

            }
        }
//
        System.out.println(Arrays.toString(A));
        return A;
    }
}

/**
 * 285 / 285 个通过测试用例
 * 状态：通过
 * 执行用时：15 ms
 *
 * 我的提交执行用时
 * 已经战胜 86.55 % 的 java 提交记录
 */
class Solution2 {
    public int[] sortArrayByParity(int[] A) {
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
        System.out.println(evenList);
        System.out.println(oddList);
//        先将evenList保存到A中，
        for (int i = 0; i < evenList.size(); i++) {
            A[i] = evenList.get(i);
        }
        System.out.println(Arrays.toString(A));

//        再将oddList保存到A中，接着保存
        for (int i = 0; i < oddList.size(); i++) {
            A[i + evenList.size()] = oddList.get(i);
        }
        System.out.println(Arrays.toString(A));

        System.out.println(Arrays.toString(A));
        return A;
    }
}
