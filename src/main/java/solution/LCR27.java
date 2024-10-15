package solution;

import DataStructure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 回文链表
 * @date 2024-7-9 15:54:58
 */
public class LCR27 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode node = head;
        while(node != null){
            list.add(node.val);
            node = node.next;
        }
        int font = 0,back = list.size() - 1;
        while(font < back){
            if(list.get(font) != list.get(back)){
                return false;
            }
            font++;
            back--;
        }
        return true;
    }
}
