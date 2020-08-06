/**
 336. 回文对
 给定一组唯一的单词， 找出所有不同 的索引对(i, j)，使得列表中的两个单词， words[i] + words[j] ，可拼接成回文串。

 示例 1:

 输入: ["abcd","dcba","lls","s","sssll"]
 输出: [[0,1],[1,0],[3,2],[2,4]]
 解释: 可拼接成的回文串为 ["dcbaabcd","abcddcba","slls","llssssll"]
 示例 2:

 输入: ["bat","tab","cat"]
 输出: [[0,1],[1,0]]
 解释: 可拼接成的回文串为 ["battab","tabbat"]
 */

package Question.Q336;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**



 */
public class Solution2 {
    public List<List<Integer>> palindromePairs(String[] words){
        List<List<Integer>> result = new ArrayList<>();

        StringBuilder sb;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j ){
                    char[] chars = (words[i] + words[j]).toCharArray();
                    
//                    System.out.println(sb);

                    boolean flag = true;
                    for (int k = 0; k < chars.length / 2; k++) {
                        if (chars[k] != chars[chars.length -1 -k]){
                            flag = false;
                            break;
                        }
                    }

                    if (flag == true){
                        result.add(Arrays.asList(i,j));
                    }
//                    System.out.println(sb_reverse);

                }
            }
        }

        System.out.println(result);
        return result;
    }
}
