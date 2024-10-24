package solution;
import DataStructure.TreeNode;

import java.util.LinkedList;

/**
 * @author kk
 * @description 二叉树展开为链表
 * @date 2024-10-23 08:31:25
 */
public class sln114 {
    private TreeNode pre = null;
    public void flatten(TreeNode root) {
        if(root == null) return;
        flatten(root.right);
        flatten(root.left);
        root.right = pre;
        root.left = null;
        pre = root;
    }
}
