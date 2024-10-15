package DataStructure;

/**
 * @author kk
 * @description 树节点定义
 * @date 2024-7-9 15:24:44
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode(){}
    TreeNode(int val){this.val = val;}
    TreeNode(int val,TreeNode left,TreeNode right){this.val = val;this.left = left;this.right = right;}
}
