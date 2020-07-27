package pub.ants.simple.question9;

/**
 * @author: magaowei
 * @Date: 2020/7/27 09:15
 * @Description:
 * 力扣链接：
 *   https://leetcode-cn.com/problems/palindrome-number/
 * 回文数：
 *   判断一个整数是否是回文数，正读和反读的数据一致。
 * 时间复杂度：
 *   本算法时间复杂度是这个数的位数一半O(log n).
 * 空间复杂度：
 *   本算法需要一个临时变量，所以空间复杂度是O(1)。
 * 思路：
 *   用临时变量*10+想%10方式，有两种情况1.两个数值相等，2.临时变量是原x的10倍。
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(11));
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int number = 0;
        while (x > number) {
            number = number * 10 + x % 10;
            x = x / 10;
        }
        return x == number || x == number / 10;
    }
}