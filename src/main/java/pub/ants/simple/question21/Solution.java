package pub.ants.simple.question21;

/**
 * @author: magaowei
 * @Date: 2020/8/5 09:12
 * @Description:
 * 力扣链接：
 *   https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * 有效括号：
 *   归并排序链表。
 * 时间复杂度：
 *   本算法需要遍历两次的链表，因此时间复杂度是O(N+M)
 * 空间复杂度：
 *   本算法所需要的额外的空间O(1)
 * 思路：
 *   归并中常见的迭代
 */
public class Solution {

    public static void main(String[] args) {
        //1->2->4, 1->3->4
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = null;
        ListNode r1 = new ListNode(1);
        ListNode r2 = new ListNode(3);
        ListNode r3 = new ListNode(4);
        r1.next = r2;
        r2.next = r3;
        r3.next = null;
        ListNode listNode = new Solution().mergeTwoLists(l1, r1);
        while (listNode!=null){
            System.out.print(listNode.val+", ");
            listNode = listNode.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preNode = new ListNode();
        ListNode headNode = preNode;

        while (l1 != null && l2 != null) {

            if(l1.val<l2.val){
                headNode.next= l1;
                l1 = l1.next;
            }else{
                headNode.next = l2;
                l2 = l2.next;
            }
            headNode = headNode.next;
        }
        headNode.next = l1==null?l2:l1;
        return preNode.next;
    }
}