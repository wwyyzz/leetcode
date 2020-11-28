/**
 93. 复原IP地址
 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。

 有效的 IP 地址正好由四个整数（每个整数位于 0 到 255 之间组成），整数之间用 '.' 分隔。

 示例:
 输入: "25525511135"
 输出: ["255.255.11.135", "255.255.111.35"]
 */

package Question.String.Q93_pass;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 执行用时：
 4 ms, 在所有 Java 提交中击败了46.06%的用户
 内存消耗：
 38.5 MB, 在所有 Java 提交中击败了70.45%的用户
 */
public class Solution1 {
    public List<String> restoreIpAddresses(String s) {

    List<String> result = new ArrayList<>();

    StringBuilder sb = new StringBuilder(s);

    for (int i = 1; i <= 3; i++) {
        for (int j = i + 1; j <= i + 3; j++) {
            for (int k = j + 1; (k <= j + 3) && k < s.length()  ; k++) {
                StringBuilder ip = new StringBuilder(sb);
                ip.insert(k,'.');
                ip.insert(j, '.');
                ip.insert(i, '.');
//                System.out.println(ip);
                String[] split = ip.toString().split("\\.");
                System.out.println(Arrays.toString(split));

                if (isValid(split)){
                    result.add(ip.toString());
                }
            }
        }
    }

        System.out.println(result);

    return result;
    }

    private boolean isValid(String[] strings) {
        boolean valid1 = true;
        if (strings[3].length() > 3 || Integer.parseInt(strings[3]) > 255 ||
                Integer.parseInt(strings[2]) > 255 ||
                Integer.parseInt(strings[1]) > 255 ||
                Integer.parseInt(strings[0]) > 255) {
            valid1 = false;
        }

        boolean valid2 = true;
        if ((strings[0].length() > 1 && strings[0].charAt(0) == '0') ||
                (strings[1].length() > 1 && strings[1].charAt(0) == '0')||
                (strings[2].length() > 1 && strings[2].charAt(0) == '0')||
                (strings[3].length() > 1 && strings[3].charAt(0) == '0')
        ) {
            valid2 =false;
        }

        return valid1 && valid2;
    }
}
