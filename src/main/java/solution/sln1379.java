package solution;

import DataStructure.TreeNode;

/**
 * @author kk
 * @description 找出克隆二叉树中的相同节点
 * @date 2024-10-17 09:53:31
 */
public class sln1379 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null){
            return null;
        }
        if(original == target){
            return cloned;
        }
        TreeNode left = getTargetCopy(original.left,cloned.left,target);
        if(left != null){
            return left;
        }
        return getTargetCopy(original.right,cloned.right,target);
    }

}
