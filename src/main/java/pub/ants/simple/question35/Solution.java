package pub.ants.simple.question35;

/**
 * @author: magaowei
 * @Date: 2020/8/17 09:20
 * @Description:
 * 力扣链接：
 *   https://leetcode-cn.com/problems/search-insert-position/
 * 搜索插入位置：
 *   给定一个排序数组和一个目标值，在数组中找目标值对应下标，如果找不到则返回将被按序插入的下标位置。
 * 时间复杂度：
 *   排序数组，利用二分查找快速定位位置，时间复杂度O(logN)。
 * 空间复杂度：
 *   需要临时变量记录数组中间值，所以空间复杂度。
 * 思路：
 *   二分查找定位位置，如果位置不存在返回插入下标，位置存在则返回下标。
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(solution.searchInsert(nums,target));
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = right;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}