/**
 * 412. Fizz Buzz
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 *
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 *
 * 示例：
 * n = 15,
 * 返回:
 * [
 *     "1",
 *     "2",
 *     "Fizz",
 *     "4",
 *     "Buzz",
 *     "Fizz",
 *     "7",
 *     "8",
 *     "Fizz",
 *     "Buzz",
 *     "11",
 *     "Fizz",
 *     "13",
 *     "14",
 *     "FizzBuzz"
 * ]
 */
package Question.Q412_p;

import java.util.ArrayList;
import java.util.List;

/**
 *
 8 / 8 个通过测试用例
 状态：通过
 执行用时：2 ms

 我的提交执行用时
 已经战胜 99.07 % 的 java 提交记录
 */
public class Solution1 {
    public List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if ( i % 15 == 0){
                list.add("FizzBuzz");
            }
            else if ( i % 3 == 0 ){
                list.add("Fizz");
            }
            else if ( i % 5 == 0 ){
                list.add("Buzz");
            }
            else {
                list.add("" + i);
            }
        }
        System.out.println(list);
        return list;

    }
}
