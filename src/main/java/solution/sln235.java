package solution;

import DataStructure.TreeNode;

/**
 * @author kk
 * @description 二叉树的最近公共祖先
 * @date 2024-10-29 09:16:46
 */
public class sln235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       TreeNode ancestor = root;
       while(true){
           if(ancestor.val > p.val && ancestor.val > q.val){
               ancestor = ancestor.left;
           }else if(ancestor.val < p.val && ancestor.val < q.val){
               ancestor = ancestor.right;
           }else{
               break;
           }
       }
        return ancestor;
    }
}
