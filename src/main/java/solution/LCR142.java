package solution;

import DataStructure.ListNode;

/**
 * @author kk
 * @description 训练计划4
 * @date 2024-10-24 14:11:47
 */
public class LCR142 {
    public ListNode trainningPlan(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }else if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }else if(l1.val <= l2.val){
            l1.next = trainningPlan(l1.next,l2);
            return l1;
        }else{
            l2.next = trainningPlan(l2.next,l1);
            return l2;
        }
    }
}
