/**
 1108. IP 地址无效化
 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。

 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。



 示例 1：

 输入：address = "1.1.1.1"
 输出："1[.]1[.]1[.]1"
 示例 2：

 输入：address = "255.100.50.0"
 输出："255[.]100[.]50[.]0"


 提示：

 给出的 address 是一个有效的 IPv4 地址
 */

package Question.Q1108;


/**
 62 / 62 个通过测试用例
 状态：通过
 执行用时：3 ms
 内存消耗：37.6 MB
 */
public class Solution1 {
    public String defangIPaddr(String address) {
//        String result = "";
        return address.replaceAll("\\.","[\\.]");
//        return result;
    }
}
