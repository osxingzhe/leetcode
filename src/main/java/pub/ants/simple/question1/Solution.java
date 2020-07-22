package pub.ants.simple.question1;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author magaowei
 * @Date: 2020/7/16 09:34
 * @Description:
 * 两数之和：
 *   给定一个整形数组nums和目标值target，假设数组中至多存在两个数相加之和等于target，如果存在两个值，输出对应下标，不存在则抛出异常。
 * 时间复杂度：
 *   本算法只遍历n个元素一遍【hashMap中get()的时间复杂度近似看作O(1)】,所以本算法的时间复杂度是O(N)
 * 空间复杂度：
 *   本算法所需要的额外的空间取决数组中元素大小(最大N个)，所以本算法的空间复杂度是O(N)
 */
public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int target = 11;
    int[] nums={3,5,8,90};
    int[] ints = solution.twoSum(nums, target);
    for(int val:ints){
      System.out.print(val+" ");
    }
  }


  public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> map = new HashMap<>();// key寸对应的值，values存储对应下标
    for(int i=0;i<nums.length;i++){
      int temp = target-nums[i];
      if(map.containsKey(temp)){
        return new int[]{map.get(temp),i};
      }else{
        map.put(nums[i],i);
      }
    }
    throw new RuntimeException("nums数组中不存在两个值加和等于target");
  }
}
