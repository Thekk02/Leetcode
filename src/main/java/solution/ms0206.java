package solution;

import DataStructure.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author kk
 * @description 回文链表
 * @date 2024-10-24 15:00:53
 */
public class ms0206 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }
        int front = 0,back = list.size() - 1;
        while(front < back){
            if(list.get(front) != list.get(back)){
                return false;
            };
            front++;
            back--;
        }
        return true;
    }
}
