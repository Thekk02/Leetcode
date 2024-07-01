package solution;

import DataStructure.ListNode;

import java.util.HashSet;

/**
 * @author kk
 * @description 环形链表2
 * @date 2024-6-26 11:00:35
 */
public class sln142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        HashSet set = new HashSet<ListNode>();
        ListNode pos = head;
        while(pos != null){
            if(set.contains(pos)){
                return pos;
            }
            set.add(pos);
            pos = pos.next;
        }
        return null;
    }
}
