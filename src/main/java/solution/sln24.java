package solution;

import DataStructure.ListNode;

/**
 * @author kk
 * @description 两两交换链表中的节点
 * @date 2024-10-24 13:45:16
 */
public class sln24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }
}
