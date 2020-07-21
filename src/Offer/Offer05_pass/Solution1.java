package Offer.Offer05_pass;

/**
 剑指 Offer 05. 替换空格
 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。



 示例 1：

 输入：s = "We are happy."
 输出："We%20are%20happy."


 限制：

 0 <= s 的长度 <= 10000
 */


/**
 * 27 / 27 个通过测试用例
 * 状态：通过
 * 执行用时：0 ms
 * 内存消耗：37.7 MB
 */
public class Solution1 {
    public String replaceSpace(String s){
        String result = "";
        result = s.replace(" ", "%20");

        System.out.println(result);
        return result;
    }
}
