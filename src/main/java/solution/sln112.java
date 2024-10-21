package solution;

import DataStructure.TreeNode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author kk
 * @description 路径总和
 * @date 2024-10-17 10:52:14
 */
public class sln112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        Queue<TreeNode> queNode = new LinkedList<>();
        Queue<Integer> queVal = new LinkedList<>();
        queNode.offer(root);
        queVal.offer(root.val);
        while(!queNode.isEmpty()){
            TreeNode now = queNode.poll();
            int temp = queVal.poll();
            if(now.left == null && now.right == null){
                if(temp == targetSum){
                    return true;
                }
                continue;
            }
            if(now.left != null){
                queNode.offer(now.left);
                queVal.offer(now.left.val+temp);
            }
            if(now.right != null){
                queNode.offer(now.right);
                queVal.offer(now.right.val + temp);
            }
        }
        return false;
    }
}
