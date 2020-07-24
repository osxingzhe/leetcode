package pub.ants.simple.question7;

/**
 * @author: magaowei
 * @Date: 2020/7/24 09:40
 * @Description:
 * 力扣链接：
 *   https://leetcode-cn.com/problems/reverse-integer/
 * 整数反转：
 *   给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转(java)。
 * 时间复杂度：
 *   本算法时间复杂度是这个数的位数log(x)
 * 空间复杂度：
 *   本算法的空间复杂度是O(1)。
 * 思路：
 *   按照取模+乘积方式，计算反转后的值(注意数据溢出)。
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(123));
    }

    public int reverse(int x) {
        int result=0;
        while (x!=0){
            int pop = x%10;
            x/=10;
            if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > Integer.MAX_VALUE % 10)){
                result = 0;
                break;
            }else if(result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && x < Integer.MIN_VALUE % 10)){
                result = 0;
                break;
            }
            result = result*10+pop;
        }
        return result;
    }
}