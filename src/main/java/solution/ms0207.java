package solution;

import DataStructure.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 链表相交
 * @date 2024-11-4 15:24:52
 */
public class ms0207 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        Set<ListNode> set = new HashSet<>();
        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
