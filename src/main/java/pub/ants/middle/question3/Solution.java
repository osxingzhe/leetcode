package pub.ants.middle.question3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: magaowei
 * @Date: 2020/7/23 19:10
 * @Description:
 * 力扣链接：
 *   https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * 无重复字符的最长子串：
 *   给定一个字符串，找出不含有重复字符的最长子串长度。
 * 时间复杂度：
 *   本算法左指针和右指针会便利一次，所以时间复杂度是O(N)
 * 空间复杂度：
 *   本算法需要最大不重复子串的元素个数，O(N)
 * 思路：
 *   利用滑动窗口+set，确定非重复值。
 */
public class Solution {

    public static void main(String[] args) {
        int val = new Solution().lengthOfLongestSubstring("abcabcd");
        System.out.println(val);
    }

        public int lengthOfLongestSubstring(String s) {
            // 用来存储最长不重复子串
            Set<Character> set = new HashSet<Character>();
            // 右指针为-1(未开始)，最大长度0，字符串长度length
            int right=-1,maxLength=0,length = s.length();
            for(int i=0;i<length;i++){
                if(i!=0){
                    // 移除上一个左指针字符
                    set.remove(s.charAt(i-1));
                }
                // 利用set判断重复，只要右边数据不在set集合里面，右指针向右走
                while (1+right<length && !set.contains(s.charAt(right+1))){
                    set.add(s.charAt(right+1));
                    ++right;
                }
                // 比较长度
                maxLength = Math.max(maxLength,right-i+1);
            }
            return maxLength;
        }
    }

