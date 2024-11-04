package solution;

import DataStructure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 链表的中间节点
 * @date 2024-10-25 11:37:16
 */
public class sln876 {
    public ListNode middleNode(ListNode head) {
        ListNode curr = new ListNode();
        List<ListNode> ans = new ArrayList<>();
        while(curr != null){
            ans.add(curr);
            curr = curr;
        }
        return ans.get(ans.size() /2 +1);
    }
}
