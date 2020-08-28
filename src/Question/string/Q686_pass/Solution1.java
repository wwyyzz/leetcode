/**
 686. 重复叠加字符串匹配
 给定两个字符串 A 和 B, 寻找重复叠加字符串A的最小次数，使得字符串B成为叠加后的字符串A的子串，如果不存在则返回 -1。

 举个例子，A = "abcd"，B = "cdabcdab"。

 答案为 3， 因为 A 重复叠加三遍后为 “abcdabcdabcd”，此时 B 是其子串；A 重复叠加两遍后为"abcdabcd"，B 并不是其子串。

 注意:

 A 与 B 字符串的长度在1和10000区间范围内。
 */

package Question.string.Q686_pass;

/**
 55 / 55 个通过测试用例
 状态：通过
 执行用时: 374 ms
 内存消耗: 40.4 MB

 */
public class Solution1 {
    public int repeatedStringMatch(String A, String B){
        int result = -1;

        int count = 1;
        StringBuilder s = new StringBuilder();
        while (count <= B.length() / A.length() + 2) {
            s.append(A);
            System.out.println("s   :" + s);
            if (s.toString().contains(B)) {
                result = count;
                break;
            }
            count++;
        }


        return result;

    }
}
