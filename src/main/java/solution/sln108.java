package solution;

import DataStructure.TreeNode;

/**
 * @author kk
 * @description 将有序数组转换为二叉搜索树
 * @date 2024-10-17 09:48:36
 */
public class sln108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length - 1);
    }
    public TreeNode helper(int[] nums,int left,int right){
        if(left > right){
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,left,mid - 1);
        root.right = helper(nums,mid + 1,right);
        return root;
    }
}
