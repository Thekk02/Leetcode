package solution;

import DataStructure.ListNode;

/**
 * @author kk
 * @description 反转链表
 * @date 2024-10-24 13:59:40
 */
public class LCR24 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr= head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        return prev;
    }
}
