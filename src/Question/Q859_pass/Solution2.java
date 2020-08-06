/**
 859. 亲密字符串
 给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。

 示例 1：

 输入： A = "ab", B = "ba"
 输出： true
 示例 2：

 输入： A = "ab", B = "ab"
 输出： false
 示例 3:

 输入： A = "aa", B = "aa"
 输出： true
 示例 4：

 输入： A = "aaaaaaabc", B = "aaaaaaacb"
 输出： true
 示例 5：

 输入： A = "", B = "aa"
 输出： false

 提示：

 0 <= A.length <= 20000
 0 <= B.length <= 20000
 A 和 B 仅由小写字母构成。
 */

package Question.Q859_pass;


import java.util.Arrays;

/**
 29 / 29 个通过测试用例
 状态：通过
 执行用时：2 ms
 内存消耗：39.8 MB
 */
public class Solution2 {
    public boolean buddyStrings(String A, String B){
        boolean result = false;

        if (A.length() != B.length()) {
            return false;
        }

        char[] A_arr = A.toCharArray();
        char[] B_arr = B.toCharArray();

        if (A.compareTo(B) == 0){
            for (int i = 0; i < A.length() - 1; i++) {
                for (int j = i + 1; j < A.length(); j++) {
                    if (A_arr[i] == A_arr[j]){
                     return true;
                    }
                }
            }

            return false;
        }

        int[] diff_a = new int[2];
        int[] diff_b = new int[2];

        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A_arr[i] != B_arr[i]){

                count++;
                if (count > 2){
                    return false;
                }
                diff_a[count - 1] = A_arr[i];
                diff_b[count - 1] = B_arr[i];
            }
        }

        System.out.println(Arrays.toString(diff_a));
        System.out.println(Arrays.toString(diff_b));


        return count == 2 && diff_a[0] == diff_b[1] && diff_a[1] == diff_b[0];


    }
}
