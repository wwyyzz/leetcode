/**

 */

package Contest.W206.Q5511_pass;

import java.util.ArrayList;
import java.util.Arrays;

/**
 95 / 95 个通过测试用例
 状态：通过
 执行用时: 12 ms
 内存消耗: 40.4 MB

 */
public class Solution1 {
    public int numSpecial(int[][] mat){
        int result = 0;
        ArrayList<int[]> list = new ArrayList();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    int[] col_row = new int[2];
                    col_row[0] = i;
                    col_row[1] = j;
                    list.add(col_row);
                }
            }
        }

        for (int[] l : list) {
            System.out.println(Arrays.toString(l));

        }

        for (int i = 0; i < list.size() ; i++) {
            boolean flag = true;
            for (int j = 0; j < list.size() ; j++) {
                if (j == i) {
                    continue;
                }
                if ( (list.get(i)[0] == list.get(j)[0]) || (list.get(i)[1] == list.get(j)[1]) ) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                result++;
            }
        }



        System.out.println(result);
        return result;

    }
}
