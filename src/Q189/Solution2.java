package Q189;

public class Solution2 {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        int k = 3;

        new s2().rotate(nums, k);

        for (Integer i:nums
        ) {
            System.out.println(i);
        }
    }
}

class s2 {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[k];
        for (int i = 0; i < k ; i++) {
            temp[i] = nums[nums.length - k + i];
        }

        for (int j = nums.length - k -1; j >= 0; j--) {
                nums[j + k] = nums[j];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        }

}