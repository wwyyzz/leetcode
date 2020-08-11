/**
 46. 全排列
 给定一个 没有重复 数字的序列，返回其所有可能的全排列。

 示例:

 输入: [1,2,3]
 输出:
 [
     [1,2,3],
     [1,3,2],
     [2,1,3],
     [2,3,1],
     [3,1,2],
     [3,2,1]
 ]
 */

package Question.Q46_pass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**

 25 / 25 个通过测试用例
 状态：通过
 执行用时：7 ms
 内存消耗：40 MB
 */
public class Solution2 {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<ArrayList> queue = new LinkedList();

        int level = 1;

        ArrayList array_nums = new ArrayList();
        for (int num : nums) {
            ArrayList list = new ArrayList();
            list.add(num);
            array_nums.add(num);
            queue.offer(list);
        }
        System.out.println("array nums:" + array_nums);

//        System.out.println(queue);

        while(level < nums.length ){
            int queque_size = queue.size();
            for (int i = 0; i < queque_size; i++) {
                ArrayList new_list = queue.poll();


//                可以先找出nums 和 new_list 的差异，然后逐个添加差异的部门到新的List
                ArrayList<Integer> diff_list = new ArrayList(array_nums);
                diff_list.removeAll(new_list);
//                System.out.println("diff is : " + diff_list);

                for (int num : diff_list) {
                    ArrayList list3 = new ArrayList(new_list);
                    list3.add(num);
                    queue.offer(list3);
                }

            }
            level++;
        }

        System.out.println(queue);

        for (ArrayList list : queue) {
            result.add(list);
        }

        System.out.println(result);
        return result;
    }
}
