package solution;


import DataStructure.TreeNode;

/**
 * @author kk
 * @description 二叉搜索树的最近公共祖先
 * @date 2024-11-1 08:27:23
 */
public class LCR193 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return root;
        }
        while(true){
            if(root.val>p.val && root.val >q.val){
                return lowestCommonAncestor(root.left,p,q);
            }else if(root.val < p.val && root.val < q.val){
                return lowestCommonAncestor(root.right,p,q);
            }else{
                return root;
            }
        }
    }
}
