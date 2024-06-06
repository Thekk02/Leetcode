package DataStructure;

/**
 * @author kk
 * @description 链表简单节点定义
 * @date 2024-6-5 08:58:11
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val = val;}
    ListNode(int val,ListNode next){this.val = val;this.next = next;}
}
