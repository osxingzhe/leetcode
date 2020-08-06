package pub.ants.simple.question27;

import java.util.Objects;

/**
 * @author: magaowei
 * @Date: 2020/8/6 09:17
 * @Description:
 * 力扣链接：
 *   https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * 删除排序数组的重复项：
 *   给定一个排序数组，删除数组中的排序项，返回移除的数组长度。
 * 时间复杂度：
 *   利用快慢指针，一次循环便利即可完成本操作O(N)。
 * 空间复杂度：
 *   需要临时变量记录数组长度，这样可以减少一次长度遍历O(1)。
 * 思路：
 *   快慢指针解决重复问题，当快慢指针不相等时，快指针的值赋值给满指针，快指针向后增加吗。
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1};
        System.out.println(new Solution().removeDuplicates(nums));
    }
    public int removeDuplicates(int[] nums) {
        if(Objects.isNull(nums)  || nums.length <= 0){
            return 0;
        }
        int left = 0,length=1;
        for(int right=1;right<nums.length;right++){
            if(nums[left] != nums[right]){
                nums[length] = nums[right];
                left  =right;
                length++;
            }
        }
        return length;
    }
}