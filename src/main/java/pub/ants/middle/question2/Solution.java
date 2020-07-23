package pub.ants.middle.question2;

/**
 * @author magaowei
 * @Date: 2020/7/16 09:34
 * @Description:
 * 力扣链接：
 *   https://leetcode-cn.com/problems/add-two-numbers/
 * 两数之和：
 *   两个非空链表逆序单节点只存一个数字，除数字0外不会以0开头。输出新链表。
 * 时间复杂度：
 *   本算法只遍历两个链表，时间复杂度max(l1.length,l2.length)
 * 空间复杂度：
 *   本算法最多需要max(l1.length,l2.length)+1个元素，因为可能存在进位
 */
public class Solution {

  public static void main(String[] args) {
    ListNode a1 = new ListNode(2);
    ListNode a2 = new ListNode(4);
    ListNode a3 = new ListNode(3);
    a1.next = a2;
    a2.next = a3;
    ListNode b1 = new ListNode(5);
    ListNode b2 = new ListNode(6);
    ListNode b3 = new ListNode(4);
    b1.next = b2;
    b2.next = b3;

    ListNode listNode = new Solution().addTwoNumbers(a1, b1);
    while (listNode!=null){
      System.out.print(listNode.val);
      listNode = listNode.next;
    }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode HeadList = new ListNode(0);
    ListNode current = HeadList;
    int currentVal = 0;
    while (l1 != null || l2 != null) {
      int x = l1 == null ? 0 : l1.val;
      int y = l2 == null ? 0 : l2.val;
      int result = currentVal + x + y;
      current.next = new ListNode(result % 10);
      currentVal = result / 10;
      current = current.next;
      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }
    if (currentVal > 0) {
      current.next = new ListNode(currentVal);
    }

    return HeadList.next;
  }
}

class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
}
