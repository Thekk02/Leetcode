package solution;

import DataStructure.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 开幕式焰火
 * @date 2024-10-17 11:02:53
 */
public class LCP44 {
    Set<Integer> set = new HashSet<>();
    public int numColor(TreeNode root) {
        dfs(root);
        return set.size();
    }
    private void dfs(TreeNode node){
        if(node == null){
            return;
        }
        set.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }

}
