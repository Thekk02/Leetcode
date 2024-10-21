package solution;

import DataStructure.TreeNode;

/**
 * @author kk
 * @description 二叉搜索树的最小绝对差
 * @date 2024-10-17 09:43:47
 */
public class sln530 {
    int pre;
    int ans;
    public int getMinimumDifference(TreeNode root) {
        ans = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return ans;
    }
    public void dfs(TreeNode node){
        if(node == null){
            return;
        }
        dfs(node.left);
        if(pre == -1){
            pre = node.val;
        }else{
            ans = Math.min(ans,node.val - pre);
            pre = node.val;
        }
        dfs(node.right);
    }
}
