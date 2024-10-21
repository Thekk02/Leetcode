package solution;

import DataStructure.TreeNode;
import sun.reflect.generics.tree.Tree;

/**
 * @author kk
 * @description 另一棵树的子树
 * @date 2024-10-17 08:18:08
 */
public class sln572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return dfs(root,subRoot);
    }

    public boolean dfs(TreeNode s,TreeNode t){
        if(s == null){
            return false;
        }
        return check(s,t) || check(s.left,t) || check(s.right,t);
    }



    public boolean check(TreeNode s,TreeNode t){
        if(s == null && t == null){
            return true;
        }
        if(s == null || t == null || s.val != t.val){
            return false;
        }
        return check(s.left,t.left) && check(s.right,t.right);
    }
}
