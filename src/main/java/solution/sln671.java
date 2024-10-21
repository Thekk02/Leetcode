package solution;

import DataStructure.TreeNode;

/**
 * @author kk
 * @description 二叉树中第二小的节点
 * @date 2024-10-17 08:40:08
 */
public class sln671 {
    int ans;
    int rootvalue;
    public int findSecondMinimumValue(TreeNode root) {
         ans = -1;
         rootvalue = root.val;
        dfs(root);
        return ans;
    }
    public void dfs(TreeNode node){
        if(node == null){
            return;
        }
        if(ans != -1 && node.val >= ans){
            return;
        }
        if(node.val > rootvalue){
            ans = node.val;
        }
        dfs(node.left);
        dfs(node.right);
    }
}
