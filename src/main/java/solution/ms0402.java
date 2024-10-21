package solution;

import DataStructure.TreeNode;


/**
 * @author kk
 * @description 最小高度树
 * @date 2024-10-17 09:11:28
 */
public class ms0402 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length - 1);
    }
    public TreeNode helper(int[] nums,int left,int right){
        if(left > right){
            return null;
        }
        //总是选择中间位置左边的数字作为根节点
        int mid = (left + right) /2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,left,mid - 1);
        root.right = helper(nums,mid + 1,right);
        return root;
    }
}
