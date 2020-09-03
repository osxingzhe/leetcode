package pub.ants.simple.question58;

/**
 * @author: magaowei
 * @Date: 2020/9/3 09:24
 * @Description:
 * 力扣链接：
 *   https://leetcode-cn.com/problems/length-of-last-word/
 * 查找最后一个单词长度：
 *   一个纯包含大小写字母和空格的字符串，查最后一个单词的长度，如果不存在最后一个单词将返回0。
 * 时间复杂度：
 *   快慢指针O(N)。
 * 空间复杂度：
 *   一个临时变量存储当前值是否是空空串，需要额外的空间O(1)。
 * 思路：
 *   快慢指针，快指针先行，遇到空格时将快指针的当前下标赋值给慢指针，当快指针达到字符串末尾时结束。
 */
public class Solution {

    public static void main(String[] args) {
        int size = new Solution().lengthOfLastWord("hello world");
        System.out.println(size);
    }

    public int lengthOfLastWord(String s) {
        // 定义快慢指针
        int slow = s.length() - 1, fast = s.length() - 1;
        // 是否执行循环
        boolean flag = true;
        for (int i = s.length() - 1; flag && i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                fast--;
            } else {
                flag = false;
            }
        }
        return slow - fast;
    }
}