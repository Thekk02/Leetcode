package solution;

import DataStructure.ListNode;

/**
 * @author kk
 * @description 合并两个有序链表
 * @date 2024-6-5 08:59:49
 */
public class sln21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1 == null && list2 == null){
            return null;
        }else if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }else if(list1.val <= list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }else{
            list2.next = mergeTwoLists(list2.next,list1);
            return list2;
        }
    }
}
