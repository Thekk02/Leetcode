package solution;

import DataStructure.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 环路检测
 * @date 2024-11-4 15:28:58
 */
public class ms0208 {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        Set<ListNode> set = new HashSet<>();
        while(head != null){
            if(set.contains(head)){
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }
}
