package solution;

import DataStructure.ListNode;

import java.util.HashSet;

/**
 * @author kk
 * @description 链表中环的入口
 * @date 2024-7-9 16:02:43
 */
public class LCR22 {
    public ListNode detectCycle(ListNode head) {
        if(head == null){return null;}
        HashSet<ListNode> set = new HashSet<>();
        ListNode node  = head;
        while(node != null){
            if(set.contains(node)){
                return node;
            }
            set.add(node);
            node = node.next;
        }
        return null;
    }
}
