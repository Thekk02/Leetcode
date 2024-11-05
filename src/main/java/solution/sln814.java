package solution;

import DataStructure.TreeNode;

/**
 * @author kk
 * @description 二叉树剪枝
 * @date 2024-11-5 08:31:55
 */
public class sln814 {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null){
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.left == null && root.right == null && root.val == 0){
            return null;
        }
        return root;
    }

}
