package Question.Q189;

public class Solution1 {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        int[] nums = {1, 2};
        int[] nums = {1};
        int k = 3;

        new s1().rotate(nums, k);

        for (Integer i:nums
        ) {
            System.out.println(i);
        }
    }
}

class s1 {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }

}