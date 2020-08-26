/**
 278. 第一个错误的版本
 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。

 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。

 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。

 示例:

 给定 n = 5，并且 version = 4 是第一个错误的版本。

 调用 isBadVersion(3) -> false
 调用 isBadVersion(5) -> true
 调用 isBadVersion(4) -> true

 所以，4 是第一个错误的版本。
 */

package Question.binary_search.Q278_pass;

/**

 */
public class Solution1 {
    public int firstBadVersion(int n){
        int result = 0;

        int start = 1;
        int end = n ;

        while (start <= end) {
            int mid = (start + end) / 2 ;
            if (isBadVersion(mid) == false && isBadVersion(mid - 1) == true) {
                return mid;
            } else if (isBadVersion(mid) == false) {
                end = mid - 1;
            } else if (isBadVersion(mid) == true && isBadVersion(mid - 1) == false) {
                return mid + 1;
            } else if (isBadVersion(mid) == true) {
                start = mid + 1;
            }
        }

        System.out.println(isBadVersion(4));
        return result;

    }

    private boolean isBadVersion(int n) {
        boolean[] version = {true,true,true,true,false,false};

        return version[n];
    }
}
