package solution;

import DataStructure.ListNode;

/**
 * @author kk
 * @description 对链表进行插入排序
 * @date 2024-11-5 08:56:46
 */
public class sln147 {
    public ListNode insertionSortList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode lastSorted = head,curr = head.next;
        while(curr != null){
            if(lastSorted.val <= curr.val){
                lastSorted = lastSorted.next;
            }else{
                ListNode prev =
            }
        }
    }
}
