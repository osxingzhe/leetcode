package pub.ants.simple.question53;

/**
 * @author: magaowei
 * @Date: 2020/9/1 09:40
 * @Description:
 * 力扣链接：
 *   https://leetcode-cn.com/problems/maximum-subarray/
 * 最大字段和：
 *   一个数组，找最大的连续字段和，子数组至少1个，返回子数组的和。
 * 时间复杂度：
 *   递归时间复杂度*遍历O(N)。
 * 空间复杂度：
 *   需要额外空间记录上次结果，O(N)。
 * 思路：
 *   子数组至少一个，表示最大子数组长度是1~n，和可能是负数。
 *   可以用前面子数组的和和当前值比较，如果前面的和比当前值小认为最大值是当前值开始的子序列
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int i = new Solution().maxSubArray(nums);
        System.out.println(i);
    }

    public int maxSubArray(int[] nums) {
        int sum=0;
        int ants = nums[0];
        for(int num: nums){
            if(sum>0){
                sum+=num;
            }else{
                sum = num;
            }
            ants = Math.max(ants,sum);
        }
        return ants;
    }
}