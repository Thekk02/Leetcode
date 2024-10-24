package solution;

import DataStructure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 图书整理1
 * @date 2024-10-24 13:37:15
 */
public class LCR123 {
    public int[] reverseBookList(ListNode head) {
        ListNode prev =null;
        ListNode curr= head;
        int length = 0;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            length += 1;
        }
        int[]  ans =new int[length];
        int j = 0;
        while(prev != null){
            ans[j] = prev.val;
            prev = prev.next;
            j+=1;
        }
        return ans;
    }
}
