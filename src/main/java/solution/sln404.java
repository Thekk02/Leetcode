package solution;


import DataStructure.TreeNode;

/**
 * @author kk
 * @description 左叶子之和
 * @date 2024-7-9 15:23:25
 */
public class sln404 {
    public int sumOfLeftLeaves(TreeNode root) {
        return root == null ? 0 : dfs(root);

    }
    public int dfs(TreeNode node){
        int ans = 0;
        if(node.left != null){
            ans += isLeafNode(node.left) ? node.left.val : dfs(node.left);
        }
        if(node.right != null && !isLeafNode(node.right)){
            ans += dfs(node.right);
        }
        return ans;
    }

    //判断是否为叶子节点函数
    public boolean isLeafNode(TreeNode node){
        return (node.left == null)&&(node.right == null);
    }


}
