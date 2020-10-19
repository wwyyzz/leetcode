/**
 5530. 奇妙序列 显示英文描述

 请你实现三个 API append，addAll 和 multAll 来实现奇妙序列。

 请实现 Fancy 类 ：
 Fancy() 初始化一个空序列对象。
 void append(val) 将整数 val 添加在序列末尾。
 void addAll(inc) 将所有序列中的现有数值都增加 inc 。
 void multAll(m) 将序列中的所有现有数值都乘以整数 m 。
 int getIndex(idx) 得到下标为 idx 处的数值（下标从 0 开始），并将结果对 109 + 7 取余。如果下标大于等于序列的长度，请返回 -1 。

 示例：
 输入：
 ["Fancy", "append", "addAll", "append", "multAll", "getIndex", "addAll", "append", "multAll", "getIndex", "getIndex", "getIndex"]
 [[], [2], [3], [7], [2], [0], [3], [10], [2], [0], [1], [2]]
 输出：
 [null, null, null, null, null, 10, null, null, null, 26, 34, 20]

 解释：
 Fancy fancy = new Fancy();
 fancy.append(2);   // 奇妙序列：[2]
 fancy.addAll(3);   // 奇妙序列：[2+3] -> [5]
 fancy.append(7);   // 奇妙序列：[5, 7]
 fancy.multAll(2);  // 奇妙序列：[5*2, 7*2] -> [10, 14]
 fancy.getIndex(0); // 返回 10
 fancy.addAll(3);   // 奇妙序列：[10+3, 14+3] -> [13, 17]
 fancy.append(10);  // 奇妙序列：[13, 17, 10]
 fancy.multAll(2);  // 奇妙序列：[13*2, 17*2, 10*2] -> [26, 34, 20]
 fancy.getIndex(0); // 返回 26
 fancy.getIndex(1); // 返回 34
 fancy.getIndex(2); // 返回 20

 提示：
 1 <= val, inc, m <= 100
 0 <= idx <= 105
 总共最多会有 105 次对 append，addAll，multAll 和 getIndex 的调用。
 */

package Contest.W211.Q5530;

/**

 */
public class Solution1 {
    public static void main(String[] args) {
        Fancy f = new Fancy();

        f.append(2);

        f.addAll(3);
        f.append(7);
        f.multAll(2);
        System.out.println(f.getIndex(0));
        f.addAll(3);
        f.append(10);
        f.multAll(2);

//        [null,null,null,8,null,12,null,null,24,24,null,null,4,null,12,null,20,null,24,null,null,37,null,null,42,null,360,null,null,null,null,null,null,null,null,null,220560,null,null,null,285845760,null,null,null,null,null,null,null,null,null,null,-144220952]

        System.out.println(f);
        System.out.println((285845760+9) *4  % 1000000007 * 15);
        System.out.println((Integer.MAX_VALUE + 285845760 *15 + 10)% 1000000007 );
    }
}
