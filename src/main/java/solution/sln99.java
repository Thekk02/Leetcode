package solution;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 恢复二叉搜索树
 * @date 2024-10-23 08:21:57
 */
public class sln99 {
    public void recoverTree(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        inorder(root,nums);

    }
    public void inorder(TreeNode root,List<Integer> nums){
        if(root == null){
            return ;
        }
        inorder(root.left,nums);
        nums.add(root.val);
        inorder(root.right,nums);
    }


}
