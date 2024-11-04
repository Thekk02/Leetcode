package solution;

import DataStructure.TreeNode;

/**
 * @author kk
 * @description 二叉搜索树中第k小的元素
 * @date 2024-10-29 09:08:35
 */
public class sln230 {
    public int kthSmallest(TreeNode root, int k) {
        return dfs(root,k);
    }
    public int dfs(TreeNode node,int k){
        if(node == null){
            return 0;
        }
        dfs(node.left,k);
        k -= 1;
        if(node != null){
            k -= 1;
            if(k == 0){
                return node.val;
            }
        }
        dfs(node.right,k);
        return 0;
    }
}
