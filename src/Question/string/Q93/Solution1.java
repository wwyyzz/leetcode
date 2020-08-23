/**
 93. 复原IP地址
 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。

 有效的 IP 地址正好由四个整数（每个整数位于 0 到 255 之间组成），整数之间用 '.' 分隔。

 示例:
 输入: "25525511135"
 输出: ["255.255.11.135", "255.255.111.35"]
 */

package Question.string.Q93;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**

 */
public class Solution1 {
    public List<String> restoreIpAddresses(String s) {

    List<String> result = new ArrayList<>();

    StringBuilder sb = new StringBuilder(s);

    for (int i = 1; i <= 3; i++) {
        for (int j = i + 1; j <= i + 3; j++) {
            for (int k = j + 1; (k < j + 3) && k < s.length() ; k++) {
                StringBuilder ip = new StringBuilder(sb);
                ip.insert(k,'.');
                ip.insert(j, '.');
                ip.insert(i, '.');
                System.out.println(ip);
                String[] split = ip.toString().split("\\.");
                System.out.println(Arrays.toString(split));

                if (    Integer.valueOf(split[3]) <= 255 &&
                        Integer.valueOf(split[2]) <= 255 &&
                        Integer.valueOf(split[1]) <= 255 &&
                        Integer.valueOf(split[0]) <= 255 ){
                    result.add(ip.toString());
                }


            }
        }
    }

        System.out.println(result);

    return result;
    }
}
