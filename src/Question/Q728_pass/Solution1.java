package Question.Q728_pass;

/**
 * @program: leetcode
 * @description: Question.Q728
 * @author: Jun Wang
 * @create: 2018-12-12 11:11
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 728. 自除数
 * 自除数 是指可以被它包含的每一位数除尽的数。
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * 还有，自除数不允许包含 0 。
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 *
 * 示例 1：
 * 输入：
 * 上边界left = 1, 下边界right = 22
 * 输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 *
 * 注意：
 * 每个输入参数的边界满足 1 <= left <= right <= 10000。
 */

/**
 *
 31 / 31 个通过测试用例
 状态：通过
 执行用时：7 ms
 已经战胜 62.11 % 的 java 提交记录
 */
public class Solution1 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

//        遍历输入范围的数
        for (int i = left; i <= right; i++) {
            //        如果包含“0”则continue
            if (Integer.toString(i).contains("0")) {
                continue;
                //		else
//        调用判断是否是自除数（），如果为true，则添加到result中
            } else {
                if (isNatureNum(i)) {
                    result.add(i);
                }
            }
        }

        return result;
    }

    //        判断是否是自除数（）{
    private boolean isNatureNum(int num) {
        //            逐位获取每一位的值
        int reminder = 0;
        int n = num;
        while (n > 0) {
            reminder = n % 10;
//            如果不能整除则返回false
//        如果能整数，则继续下一位进行判断

            if (num % reminder != 0) {
                return false;
            } else {
                n /= 10;
            }
        }
//            都能整除的话返回true
        return true;
    }

}