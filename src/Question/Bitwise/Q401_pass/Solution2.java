/**
 401. 二进制手表
 二进制手表顶部有 4 个 LED 代表 小时（0-11），底部的 6 个 LED 代表 分钟（0-59）。

 每个 LED 代表一个 0 或 1，最低位在右侧。

 例如，上面的二进制手表读取 “3:25”。

 给定一个非负整数 n 代表当前 LED 亮着的数量，返回所有可能的时间。

 示例：
 输入: n = 1
 返回: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]

 提示：
 输出的顺序没有要求。
 小时不会以零开头，比如 “01:00” 是不允许的，应为 “1:00”。
 分钟必须由两位数组成，可能会以零开头，比如 “10:2” 是无效的，应为 “10:02”。
 超过表示范围（小时 0-11，分钟 0-59）的数据将会被舍弃，也就是说不会出现 "13:00", "0:61" 等时间。
 */

package Question.Bitwise.Q401_pass;

import java.util.ArrayList;
import java.util.List;

/**

 解法可以再优化，使用从bitcount 到时间会多出很多不可能的时间值，再通过if来筛选   1024
 可以使用从0:00 到 11:59来遍历                                             720

 执行用时：
 7 ms, 在所有 Java 提交中击败了83.86%的用户
 内存消耗：
 37.4 MB, 在所有 Java 提交中击败了77.83%的用户

 */
public class Solution2 {
    public List<String> readBinaryWatch(int num) {
        int count = 0;
        List<String> result = new ArrayList<>();

        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                count++;
                if ((Integer.bitCount(hour) + Integer.bitCount(minute)) == num) {
                    StringBuilder sb = new StringBuilder();

                    sb.append(hour).append(":");
                    sb = minute < 10 ? sb.append("0").append(minute) :sb.append( minute );

                    result.add(sb.toString());
                }
            }
        }

        System.out.println(result);
        System.out.println(count);
        return result;

    }
}
