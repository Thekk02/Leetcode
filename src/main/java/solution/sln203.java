package solution;

import DataStructure.ListNode;

/**
 * @author kk
 * @description 移除链表元素
 * @date 2024-10-16 13:27:33
 */
public class sln203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        head.next = removeElements(head.next,val);
        return head.val == val ? head.next : head;
    }
}
