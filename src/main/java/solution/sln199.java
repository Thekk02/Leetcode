package solution;

import DataStructure.TreeNode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author kk
 * @description 二叉树的右视图
 * @date 2024-10-29 08:59:11
 */
public class sln199 {
    List<Integer> ans = new LinkedList<>();
    Queue<TreeNode> queue = new ArrayDeque<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return ans;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i =0 ;i <size;i++ ){
                TreeNode curr = queue.poll();
                if(i == size - 1){
                    ans.add(curr.val);
                }
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }

        }
        return ans;
    }
}
