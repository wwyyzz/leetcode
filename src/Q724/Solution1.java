/**
 * 724. 寻找数组的中心索引
 * 给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。
 * 我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 *
 * 示例 1:
 * 输入:
 * nums = [1, 7, 3, 6, 5, 6]
 * 输出: 3
 * 解释:
 * 索引3 (nums[3] = 6) 的左侧数之和(1 + 7 + 3 = 11)，与右侧数之和(5 + 6 = 11)相等。
 * 同时, 3 也是第一个符合要求的中心索引。
 *
 * 示例 2:
 * 输入:
 * nums = [1, 2, 3]
 * 输出: -1
 * 解释:
 * 数组中不存在满足此条件的中心索引。
 *
 * 说明:
 * nums 的长度范围为 [0, 10000]。
 * 任何一个 nums[i] 将会是一个范围在 [-1000, 1000]的整数。
 */
package Q724;

/**
 * [-1,-1,-1,0,1,1]测试不通过
 * 解答错误
 * 输入
 * [-1,-1,-1,0,1,1]
 * 输出       修改index范围为[0,length]解决
 * -1
 * 预期结果
 * 0
 *
 741 / 741 个通过测试用例
 状态：通过
 执行用时：188 ms

 我的提交执行用时
 已经战胜 27.73 % 的 java 提交记录
 *
 */
public class Solution1 {
    public int pivotIndex(int[] nums) {
//  创建result，初始化为-1
        int result = -1;
        //        计算整个数列的总和sum
        int sum = 0;
        for (Integer i:nums
             ) {
            sum += i;
        }

//
//  遍历数组
        for (int i = 0; i < nums.length ; i++) {
//        如果sum - 当前元素 是偶数，否则continue
//        计算前面元素 是否 == （sum - 当前）/ 2
//        如果是则返回结果，否则continue

            if ((sum - nums[i]) % 2 == 0){
                int half = 0;
//                用了两次的循环，效率低
                for (int j = 0; j < i; j++) {
                    half += nums[j];
                }
                if (half == ((sum - nums[i]) / 2)){
                    return i;
                }
                }else{
                continue;
            }

        }

//
//  返回result
        return result;
    }
}


/**
 *解法2只用了一次循环，效率更高
 741 / 741 个通过测试用例
 状态：通过
 执行用时：44 ms

 我的提交执行用时
 已经战胜 48.53 % 的 java 提交记录
 */
class Solution2 {
    public int pivotIndex(int[] nums) {
//  创建result，初始化为-1
        int result = -1;
        //        计算整个数列的总和sum
        int sum = 0;
        for (Integer i:nums
                ) {
            sum += i;
        }

//
//        初始化 before 和after分布保存前后两端的和
        int before = 0;
        int after = 0;
//        遍历数组（after逐渐减少，before逐渐增大）
        for (int i = 0; i < nums.length ; i++) {
//        after = sum - 当前元素 - before
//        如果 before == after
//                返回result= 当前的index
//        否则：before += 当前的元素
            after = sum - nums[i] - before;
            if (after == before){
                return i;
            }else{
                before += nums[i];
            }
        }

//
//  返回result
        return result;
    }
}