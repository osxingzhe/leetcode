package pub.ants.simple.question13;

/**
 * @author: magaowei
 * @Date: 2020/7/29 09:36
 * @Description:
 * 力扣链接：
 *   https://leetcode-cn.com/problems/roman-to-integer/
 * 罗马数字转整数：
 *   给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 * 时间复杂度：
 *   本算法时间复杂度循环遍历一次O(n).
 * 空间复杂度：
 *   本算法需要一个临时变量，所以空间复杂度是O(1)。
 * 思路：
 *   用前后数比较相加减。
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("MCMXCV"));
    }
    public int romanToInt(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1;i < s.length(); i ++) {
            int num = getValue(s.charAt(i));
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }

    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

}