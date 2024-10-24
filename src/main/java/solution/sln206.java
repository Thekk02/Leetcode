package solution;

import DataStructure.ListNode;

import java.util.List;
import java.util.Stack;

/**
 * @author kk
 * @description 反转链表
 * @date 2024-10-24 13:52:16
 */
public class sln206 {
    public ListNode reverseList(ListNode head) {
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
