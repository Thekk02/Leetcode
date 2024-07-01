package solution;

import DataStructure.ListNode;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.list;


/**
 * @author kk
 * @description 链表重排
 * @date 2024-6-26 11:05:56
 */
public class sln143 {
    public void reorderList(ListNode head) {
        if(head == null){
            return ;
        }
        List<ListNode> list = new ArrayList<ListNode>();
        ListNode node =head;
        while(node != null){
            list.add(node);
            node = node.next;
        }
        int i = 0,j = list.size() - 1;
        while(i < j){
            list.get(i).next = list.get(j);
            i++;
            if(i == j){
                break;
            }
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
    }
}
