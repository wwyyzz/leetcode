/**
 150. 逆波兰表达式求值
 根据 逆波兰表示法，求表达式的值。

 有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。



 说明：

 整数除法只保留整数部分。
 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。


 示例 1：

 输入: ["2", "1", "+", "3", "*"]
 输出: 9
 解释: 该算式转化为常见的中缀算术表达式为：((2 + 1) * 3) = 9
 示例 2：

 输入: ["4", "13", "5", "/", "+"]
 输出: 6
 解释: 该算式转化为常见的中缀算术表达式为：(4 + (13 / 5)) = 6
 示例 3：

 输入: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
 输出: 22
 解释:
 该算式转化为常见的中缀算术表达式为：
 ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 = ((10 * (6 / (12 * -11))) + 17) + 5
 = ((10 * (6 / -132)) + 17) + 5
 = ((10 * 0) + 17) + 5
 = (0 + 17) + 5
 = 17 + 5
 = 22


 逆波兰表达式：

 逆波兰表达式是一种后缀表达式，所谓后缀就是指算符写在后面。

 平常使用的算式则是一种中缀表达式，如 ( 1 + 2 ) * ( 3 + 4 ) 。
 该算式的逆波兰表达式写法为 ( ( 1 2 + ) ( 3 4 + ) * ) 。
 逆波兰表达式主要有以下两个优点：

 去掉括号后表达式无歧义，上式即便写成 1 2 + 3 4 + * 也可以依据次序计算出正确结果。
 适合用栈操作运算：遇到数字则入栈；遇到算符则取出栈顶两个数字进行计算，并将结果压入栈中。
 */

package Question.StackAndQueue.Q150_pass;

import java.util.LinkedList;

/**
 执行用时：
 8 ms, 在所有 Java 提交中击败了35.72%的用户
 内存消耗：
 38.6 MB, 在所有 Java 提交中击败了66.15%的用户

 switch 优化，不用先判断是否是操作符，直接作为default处理
 */
public class Solution2 {
    public int evalRPN(String[] tokens){
        LinkedList<Integer> s = new LinkedList<>();
        int b ;
        int a ;
        for (String token : tokens) {

            switch (token) {

                case "+" :
                    b = s.pop();
                    a = s.pop();
                    s.push(a + b);
                    break;
                case "-" :
                    b = s.pop();
                    a = s.pop();
                    s.push(a - b);
                    break;
                case "*" :
                    b = s.pop();
                    a = s.pop();
                    s.push(a * b);
                    break;
                case "/" :
                    b = s.pop();
                    a = s.pop();
                    s.push(a / b);
                    break;
                default:
                    s.push(Integer.valueOf(token));

                }
            }

        return  s.pop();

    }


}
