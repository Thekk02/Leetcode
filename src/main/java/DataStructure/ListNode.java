package DataStructure;

/**
 * @author kk
 * @description 链表简单节点定义
 * @date 2024-6-5 08:58:11
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(){}
    ListNode(int val){this.val = val;this.next = null;}
    ListNode(int val,ListNode next){this.val = val;this.next = next;}
}
