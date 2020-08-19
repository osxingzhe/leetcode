package pub.ants.simple.question38;

/**
 * @author: magaowei
 * @Date: 2020/8/17 09:20
 * @Description:
 * 力扣链接：
 *   https://leetcode-cn.com/problems/search-insert-position/
 * 外观数列：
 *   一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
 * 时间复杂度：
 *   递归时间复杂度*遍历O(N)。
 * 空间复杂度：
 *   需要额外空间记录上次结果，O(N)。
 * 思路：
 *   快慢指针牛逼+递归解决
 */
class Solution {

    public static void main(String[] args) {
        String s = new Solution().countAndSay(6);
        System.out.println(s);

    }

    public String countAndSay(int n) {
        // 递归终止条件
        if (n == 1) {
            return "1";
        }
        StringBuffer res = new StringBuffer();
        // 拿到上一层的字符串
        String str = countAndSay(n - 1);
        int length = str.length();
        // 开始指针为0
        int start = 0;
        // 注意这从起始条件要和下面长度统一
        for (int i = 1; i < length + 1; i++) {
            // 字符串最后一位直接拼接
            if (i == length) {
                res.append(i - start).append(str.charAt(start));
                // 直到start位的字符串和i位的字符串不同，拼接并更新start位
            } else if (str.charAt(i) != str.charAt(start)) {
                res.append(i - start).append(str.charAt(start));
                start = i;
            }
        }
        return res.toString();
    }
}


