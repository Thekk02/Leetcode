package solution;

import DataStructure.TreeNode;

/**
 * @author kk
 * @description 求根节点到叶节点数字之和
 * @date 2024-10-29 08:53:51
 */
public class sln129 {
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
    public int dfs(TreeNode root,int prevSum){
        if(root == null){
            return 0;
        }
        int sum = prevSum * 10 + root.val;
        if(root.left == null && root.right == null){
            return sum;
        }
        else{
            return dfs(root.left,sum) + dfs(root.right,sum);
        }
    }
}
