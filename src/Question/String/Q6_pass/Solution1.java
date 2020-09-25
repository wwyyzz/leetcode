/**
 6. Z 字形变换
 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。

 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：

 L   C   I   R
 E T O E S I I G
 E   D   H   N
 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。

 请你实现这个将字符串进行指定行数变换的函数：

 string convert(string s, int numRows);
 示例 1:

 输入: s = "LEETCODEISHIRING", numRows = 3
 输出: "LCIRETOESIIGEDHN"
 示例 2:

 输入: s = "LEETCODEISHIRING", numRows = 4
 输出: "LDREOEIIECIHNTSG"
 解释:

 L     D     R
 E   O E   I I
 E C   I H   N
 T     S     G
 */

package Question.String.Q6_pass;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 执行用时：
 37 ms, 在所有 Java 提交中击败了11.05%的用户
 内存消耗：
 39.9 MB, 在所有 Java 提交中击败了10.09%的用户
 */
public class Solution1 {
    public String convert(String s, int numRows){
        String result = new String();
        //1、构造numRows个ArrayList
        ArrayList[] list = new ArrayList[numRows];

        for (int i = 0; i < numRows; i++) {
            list[i] = new ArrayList();
        }

        LinkedList<Integer> queue = new LinkedList<>();

        //2、构造一个循环队列  对于numRow = 4 ，遍历顺序为012321,012321,012321
        for (int i = 0; i <numRows ; i++) {
            queue.offer(i);
        }
        for (int i = numRows - 2; i > 0 ; i--) {
            queue.offer(i);
        }

        System.out.println(queue);
        //该循环队列实现Z形的遍历s,精彩的地方就在这
        for (int i = 0; i < s.length(); i++) {
            int list_no = queue.poll();
            list[list_no].add(s.charAt(i));
            queue.offer(list_no);
        }

        //3、生成result字符串返回
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                result += list[i].get(j);
            }
        }

        System.out.println(result);
        return result;

    }
}
