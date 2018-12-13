/**
 * 551. 学生出勤纪录 I
 * 给定一个字符串来代表一个学生的出勤纪录，这个纪录仅包含以下三个字符：
 *
 * 'A' : Absent，缺勤
 * 'L' : Late，迟到
 * 'P' : Present，到场
 * 如果一个学生的出勤纪录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
 * 你需要根据这个学生的出勤纪录判断他是否会被奖赏。
 *
 * 示例 1:
 * 输入: "PPALLP"
 * 输出: True
 *
 * 示例 2:
 * 输入: "PPALLL"
 * 输出: False
 */
package Q551;

/**
 *
 113 / 113 个通过测试用例
 状态：通过
 执行用时：5 ms

 我的提交执行用时
 已经战胜 99.64 % 的 java 提交记录
 */
public class Solution1 {
    public boolean checkRecord(String s) {
//        查找String中A的数量< = 1     条件1

        int absentCount = 0;
        for (char c:s.toCharArray()
             ) {
            if (c == 'A'){
                absentCount++;
            }
        }

        int lateConditions= s.indexOf("LLL");
//        查找String中是否存在LLL的子串   条件2
//
//        如果   （条件1 = =true  并且  条件2 == false）则返回true
        return absentCount <= 1 && lateConditions == -1;
    }
}
