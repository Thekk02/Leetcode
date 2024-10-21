package solution;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 二叉树的右视图
 * @date 2024-10-18 09:02:30
 */
public class LCR46 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans =new ArrayList<>();
        dfs(root,ans);
        return ans;
    }
    public void dfs(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        if(root.right == null){
            dfs(root.left,list);
        }else{
            dfs(root.right,list);
        }

    }

}
