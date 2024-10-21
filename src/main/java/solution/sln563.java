package solution;

import DataStructure.TreeNode;

/**
 * @author kk
 * @description 二叉树的坡度
 * @date 2024-10-17 09:22:41
 */
public class sln563 {
    int ans = 0;
    public int findTilt(TreeNode root) {
        dfs(root);
        return ans;
    }
    public int dfs(TreeNode node){
        if(node == null){
            return 0;
        }
        int sumleft = dfs(node.left);
        int sumright = dfs(node.right);
        ans += Math.abs(sumleft - sumright);
        return sumleft + sumright + node.val;
    }
}
