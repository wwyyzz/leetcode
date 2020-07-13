package Question.Q26;

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        int[] nums = {-3, -1, 0, 0, 0, 3, 3};

        int result = new s1().removeDuplicates(nums);

        for (int i = 0; i < result; i++) {
            System.out.println(nums[i]);
        }
    }
}


/**
 * 执行结果：
 * 通过
 * 显示详情
 * 执行用时：
 * 20 ms
 * , 在所有 Java 提交中击败了
 * 7.76%
 * 的用户
 * 内存消耗：
 * 40.8 MB
 * , 在所有 Java 提交中击败了
 * 12.29%
 * 的用户
 */
class s1 {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();

        for (Integer i:nums
        ) {
            set.add(i);
        }

        System.out.println(set);

        int i = 0;
        for (Integer n : set){
            nums[i++] = n;
        }

        return set.size();
    }
}