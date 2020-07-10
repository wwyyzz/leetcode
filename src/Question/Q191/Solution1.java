/*
  191. 位1的个数
  编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。

  示例 :
  输入: 11
  输出: 3
  解释: 整数 11 的二进制表示为 00000000000000000000000000001011


  示例 2:
  输入: 128
  输出: 1
  解释: 整数 128 的二进制表示为 00000000000000000000000010000000
 */


package Question.Q191;

/**
 * 将n转为Integer.toBinaryString(n) 再转为 Array，统计其中字符为1的数量。
 *
 * 600 / 600 个通过测试用例
 * 状态：通过
 * 执行用时：5 ms
 *
 * 我的提交执行用时
 * 已经战胜 10.84 % 的 java 提交记录
 */
public class Solution1 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
//        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        String s = Integer.toBinaryString(n);

        System.out.println(Integer.toBinaryString(n));

        int count = 0;
        for (char c:s.toCharArray()
             ) {
            if (c == '1'){
                count++;
            }
        }
        return count;
    }
}

/**
 *
 * ①、二进制数n，n-1后，如果最后一位是0，将向前一位借2，2-1=1。最后一位为1。
 * 如果前一位为0，将继续向前一位借2，加上本身少掉的1.则变为1。一直遇到1。减为0.
 * 所以 二进制 xxxx10000-1 = xxxx01111
 * ②、n&n-1
 * 按照上述 n=xxxx10000，n-1=xxxx01111
 * xxxx10000
 * xxxx01111
 * ----------------------------------
 * xxxx0000
 * 可以看到将原来的最右边的1变为0了。
 *
 * 重复操作，有多少个1，这个操作就可以执行多少次。
 */
class Solution2 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        int count = 0;

        while ( n != 0){
            count++;
            n = n & (n-1);
            System.out.println(Integer.toBinaryString(n));
        }

        return count;
    }
}