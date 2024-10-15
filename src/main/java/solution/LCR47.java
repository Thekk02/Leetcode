package solution;

import DataStructure.TreeNode;

/**
 * @author kk
 * @description 二叉树剪枝
 * @date 2024-7-9 15:38:54
 */
public class LCR47 {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null){
            return root;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.left == null && root.right == null && root.val == 0){
            return null;

        }
        return root;
    }
}
