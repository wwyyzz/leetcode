package Q136;
import java.lang.reflect.Array;
import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
//        int[] nums = {2, 2, 1};
        int[] nums = {1,2, 3, 4, 3, 2, 1};
//        int[] nums = {4, 1, 2, 2, 1};

        int result = new s1().singleNumber(nums);

        System.out.println(result);
    }


}

class s1 {

    public int singleNumber(int[] nums) {
        ArrayList list = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            list.add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            
        }
        
        

        System.out.println("size = " + list.size());
//        int count = 1;
//        for (int i = 0; i < nums.length; i++) {
//            int count = 1;
//            for (int j = 0; j < nums.length; j++) {
//                if ( nums[i] == nums[j]){
//                    count++;
//                    break;
//                }
//            }
//            if (count == 1){
//                return nums[i];
//            }
//        }

        return nums[nums.length-1];
    }
}
