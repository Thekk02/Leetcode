package solution;

import DataStructure.ListNode;

/**
 * @author kk
 * @description 相交链表
 * @date 2024-7-9 15:45:57
 */
public class LCR23 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode pa = headA;
        ListNode pb = headB;
        while(pa != pb){
            pa = pa == null ? headB : pa.next;
            pb = pb == null ? headA : pb.next;
        }
        return pa;
    }
}
