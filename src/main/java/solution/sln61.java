package solution;

import DataStructure.ListNode;

import java.util.List;

/**
 * @author kk
 * @description 旋转链表
 * @date 2024-11-4 15:18:56
 */
public class sln61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0||head == null||head.next==null){
            return head;
        }
        int n = 1;
        ListNode iter = head;
        while(iter.next != null){
            iter = iter.next;
            n++;
        }
        int add = n - k % n;
        if(add == n){
            return head;
        }
        return null;
    }
}
