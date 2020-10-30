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
 执行用时：
 8 ms, 在所有 Java 提交中击败了82.56%的用户
 内存消耗：
 38.8 MB, 在所有 Java 提交中击败了42.54%的用户

 解法可以再优化，使用从bitcount 到时间会多出很多不可能的时间值，再通过if来筛选
 可以使用从0:00 到 11:59来遍历
 */
public class Solution1 {
    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<>();

        int count = 0;
        for (int i = (1 << 10); i < (1 << 11); i++) {
            count++;
            if (Integer.bitCount(i) == num + 1) {
                int hour = Integer.valueOf(Integer.toBinaryString(i).substring(1,5), 2);
                int minute = Integer.valueOf(Integer.toBinaryString(i).substring(5), 2);

                if (hour < 12 && minute < 60) {
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
