package solution;

import DataStructure.TreeNode;

/**
 * @author kk
 * @description 从根到叶的二进制数之和
 * @date 2024-10-17 11:06:32
 */
public class sln1022 {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,0);
    }
    public int dfs(TreeNode root,int val){
        if(root == null){
            return 0;
        }
        val = (val << 1) | root.val;
        if(root.left == null && root.right == null){
            return val;
        }
        return dfs(root.left,val) + dfs(root.right,val);
    }
}
