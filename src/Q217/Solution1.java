package Q217;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        boolean result = new s1().containsDuplicate(nums);

        System.out.println("result =" + result);

    }
}

class s1 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for ( Integer i: nums){
            if (set.contains(i)){
                return true;
            }
            set.add(i);
        }

//        return (nums.length == set.size())?(false):(true);
        return false;
    }
}

//class s2 {
//    public boolean containsDuplicate(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for ( Integer i: nums){
//            map.put(i,)
//        }
//
//        return (nums.length == set.size())?(false):(true);
//    }
//}
