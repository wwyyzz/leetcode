package Question.Q167;

/**
 * @program: leetcode
 * @description: Question.Q167
 * @author: Jun Wang
 * @create: 2018-12-17 16:29
 */

/**
 * 167. 两数之和 II - 输入有序数组
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 *
 * 说明:
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 *
 * 示例:
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 */

/**
 *
 *
 * 17 / 17 个通过测试用例
 * 状态：通过
 * 执行用时：128 ms
 * 已经战胜 10.42 % 的 java 提交记录
 */
public class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
//        外层循环numbers
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                //                如果[i] + [j] == target，返回i,j
                if ( numbers[i] + numbers[j] == target){
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }
            }
            
        }
//                内循环numbers
//


        return result;
    }
}

/**
 *
 17 / 17 个通过测试用例
 状态：通过
 执行用时：1 ms
 已经战胜 97.81 % 的 java 提交记录
 */

class Solution2 {
    public int[] twoSum(int[] numbers, int target) {
//        int[] result = new int[2];
//        low = index 0
//        high = length -1
        int low = 0;
        int high = numbers.length - 1;
//        while （ low < high）{
        int sum = 0;
        while( low < high){
//            如果number[low] + number[high] == target,则返回low，high
            sum = numbers[low] + numbers[high];
            System.out.println("sum = "+ sum + "low = " + low + "high = "+ high);
//            如果                            < target,则 low++
//            如果                            > target,则high++
            if ( sum > target){
                high--;
                continue;
            }else if (sum < target){
                low++;
                continue;
            }else {
                return new int[]{low + 1, high + 1};
            }

        }

        return null;


    }
}
