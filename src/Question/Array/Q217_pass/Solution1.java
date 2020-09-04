package Question.Array.Q217_pass;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public boolean containsDuplicate(int[] nums){

        Set set = new HashSet();

        for (int num : nums) {
            set.add(num);
        }

        System.out.println(set.toString());
        System.out.println(nums.length != set.size());
        return nums.length != set.size();

//        System.out.println("result =" + result);

    }
}




