package solution;

import DataStructure.TreeNode;

/**
 * @author kk
 * @description 检查平衡性
 * @date 2024-10-17 10:37:09
 */
public class ms0404 {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);

    }
    public int height(TreeNode node){
        if(node == null){
            return 0;
        }
        else{
            return Math.max(height(node.left),height(node.right)) + 1;
        }
    }
}
