package pub.ants.simple.question20;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author: magaowei
 * @Date: 2020/8/4 09:15
 * @Description:
 * 力扣链接：
 *   https://leetcode-cn.com/problems/valid-parentheses/
 * 有效括号：
 *   ([{}])括号匹配，按照顺序匹配。
 * 时间复杂度：
 *   本算法只遍历n个元素一遍，hash获取key可看作常数级别,所以本算法的时间复杂度是O(N)
 * 空间复杂度：
 *   本算法所需要的额外的空间取决数组中元素大小(最大N/2个)，所以本算法的空间复杂度是O(N)
 * 思路：
 *   利用hashMap中k-v，key存储值，value存下标，get(key)可以认为O(1),可以降低时间复杂度，利用栈头部特性简便完成
 */
class Solution {

    private HashMap<Character, Character> mappings;

    public Solution() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("((())){}"));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (this.mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
