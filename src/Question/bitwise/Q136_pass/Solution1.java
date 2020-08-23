//136. 只出现一次的数字
//        题目描述提示帮助提交记录社区讨论阅读解答
//        给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
//        说明：
//
//        你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
//
//        示例 1:
//
//        输入: [2,2,1]
//        输出: 1
//        示例 2:
//
//        输入: [4,1,2,1,2]
//        输出: 4

package Question.bitwise.Q136_pass;
import java.util.*;

public class Solution1 {

}

class s1 {

    public int singleNumber(int[] nums) {
        int result = 0;
        int flag = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            flag = 0;
            for (int j = 0; j < nums.length; j++) {
//                System.out.println("num[i]="+nums[i]+" nums[j]" + nums[j]);
                if (i != j && nums[j] == nums[i]) {
                    flag = 1;
                    break;
                }

            }
//            System.out.println("flag = "+flag);
            if (flag == 0){
//                System.out.println("result = "+nums[i]);
                result = nums[i];
                break;
            }

        }
        return result;
    }
}

class s2 {

    public int singleNumber(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();

        for (Integer i:nums
             ) {
            list1.add(i);
        }

        Set<Integer> set = new HashSet(list1);

        ArrayList<Integer> list2 = new ArrayList(set);

        for (Integer i:list2
             ) {
            list1.remove(i);
        }
        for (Integer i:list1
                ) {
            list2.remove(i);
        }

        return list2.get(0);

    }
}