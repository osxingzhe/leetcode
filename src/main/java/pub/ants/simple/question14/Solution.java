package pub.ants.simple.question14;

/**
 * @author: magaowei
 * @Date: 2020/7/31 09:41
 * @Description:
 *
 * 力扣链接：
 *   hhttps://leetcode-cn.com/problems/longest-common-prefix/
 * 最长公共前缀：
 *   编写一个函数来查找字符串数组中的最长公共前缀。
 * 时间复杂度：
 *   本算法时间复杂度循环遍历一次O(n*n).
 * 空间复杂度：
 *   本算法需要一个临时变量，所以空间复杂度是O(1)。
 * 思路：
 *   每个字符串比较相同的前缀，如果匹配不到返回空串。
 */
public class Solution {

    public static void main(String[] args) {
        String[] strs = {"qwe","qws","q"};
        System.out.println(new Solution().longestCommonPrefix(strs));
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int count = strs.length;
        for (int i = 1; i < count; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    public String longestCommonPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }
}