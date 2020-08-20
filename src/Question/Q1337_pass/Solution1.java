/**

 */

package Question.Q1337_pass;

import java.util.*;

/**

 52 / 52 个通过测试用例
 状态：通过
 执行用时：7 ms
 内存消耗：40.5 MB
 */
public class Solution1 {
    public int[] kWeakestRows(int[][] mat, int k){
        int[] result =new int[k];

        TreeMap map = new TreeMap();
        for (int i = 0; i < mat.length; i++) {
            int count = 0 ;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] > 0) {
                    count++;
                } else {
                    break;
                }
            }

            map.put(i,count);

        }

        System.out.println(map);

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        System.out.println(list);

        //lambda
        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

//        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });


        System.out.println(list);
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        System.out.println(Arrays.toString(result));
        return result;

    }
}
