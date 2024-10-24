package solution;
import DataStructure.ListNode;

/**
 * @author kk
 * @description 二进制链表转整数
 * @date 2024-10-24 15:30:17
 */
public class sln1290 {
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        ListNode curr = head;
        while(curr != null){
            ans = ans*2 + curr.val;
            curr = curr.next;
        }
        return ans;
    }
}
