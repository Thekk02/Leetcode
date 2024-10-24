package solution;

import DataStructure.ListNode;

/**
 * @author kk
 * @description 训练计划3
 * @date 2024-10-24 14:08:14
 */
public class LCR141 {
    public ListNode trainningPlan(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
