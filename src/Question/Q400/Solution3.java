package Question.Q400;

/**
 * @program: leetcode
 * @description: Question.Q400
 * @author: Jun Wang
 * @create: 2018-12-17 15:37
 */

/**
 * 400. 第N个数字
 * 在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 个数字。
 *
 * 注意:
 * n 是正数且在32为整形范围内 ( n < 231)。
 *
 * 示例 1:
 * 输入:
 * 3
 * 输出:
 * 3
 *
 * 示例 2:
 * 输入:
 * 11
 * 输出:
 * 0
 *
 * 说明:
 * 第11个数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是0，它是10的一部分。
 */

import java.util.HashMap;

/**
 *  这是一道奥数题
 */
public class Solution3 {
    public int findNthDigit(int n) {
//        int num = n;

        if (n < 10) {
            return n;
        }

        int digitals = 0;

        HashMap<Integer,Integer> map = new HashMap();
        map.put(0,0);
        for (int i = 1; i < 10; i++) {
            map.put(i , 9 * i * (int)Math.pow(10, i - 1) + map.get(i - 1)  );
        }

        for (int i = 1; i < 10; i++) {
            if (map.get(i) > n) {
                digitals = i ;
                break;
            }
        }


        System.out.println(map);
        System.out.println("digitals   :" + digitals);

        int num = (int)Math.pow(10, digitals - 1) + (n - map.get(digitals - 1)) / digitals ;

        System.out.println("num   :" + num);



        int idx = n % digitals;

        if (idx != 0)
        {
            return Integer.toString(num).charAt(idx) - '0';
        }
        else
        {
            String s = Integer.toString(num - 1);
            return s.charAt(s.length() - 1) - '0';
        }


    }
}
