package solution;
import DataStructure.TreeNode;

/**
 * @author kk
 * @description 合法二叉搜索树
 * @date 2024-10-22 09:51:43
 */
public class ms0405 {
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }
    public boolean helper(TreeNode node,Integer lower,Integer upper){
        if(node == null){
            return true;
        }
        int val = node.val;
        if(lower != null && val <= lower){
            return false;
        }
        if(upper != null && val >= upper){
            return false;
        }
        if(!helper(node.right,val,upper)){
            return false;
        }
        if (!helper(node.left, lower, val)) {
            return false;
        }
        return true;
    }
}
