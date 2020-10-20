package pub.ants.simple.question66;

import java.util.Arrays;

/**
 * @author: magaowei
 * @date: 2020/10/14 09:45
 * @description: 力扣链接：
 * https://leetcode-cn.com/problems/plus-one/
 * 加一：
 *   给定一个由整数组成的非空数组标识的非负整数，在该数的基础上加一。最高位数字存放在数组的首位，数组中每个元素只存储单个数字。你可以假设除了整数0之外，这个整数不会以零开头。
 * 时间复杂度：
 *   一个for循环，时间复杂度O(N)
 * 空间复杂度：
 *   plusOne1没有使用到临时变量，牛逼
 * 思路：
 *   当循环结束时，如果最高位是0，表示要加一位
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = {9, 8, 9};
        solution.plusOne1(digits);
    }

    public int[] plusOne1(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        Arrays.stream(digits).asLongStream().forEach(x -> System.out.println(x));
        return digits;
    }


    public int[] plusOne(int[] digits) {
        String str = new String();

        int tem = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int num = digits[i] + tem;
            tem = num / 10;
            str = num % 10 + str;
        }
        if (tem == 1) {
            str = 1 + str;
        }
        System.out.println(str);
        return null;
    }
}
