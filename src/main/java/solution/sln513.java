package solution;

import DataStructure.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author kk
 * @description 找树左下角的值
 * @date 2024-10-29 09:29:32
 */
public class sln513 {
    public int findBottomLeftValue(TreeNode root) {
        int ans = 0;
        if(root == null){
            return ans;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i < size;i++){
                TreeNode curr = queue.poll();
                if(i == 0){
                    ans = curr.val;
                }
                if(curr.left != null){
                    queue.offer(curr.left);
                }
                if(curr.right != null){
                    queue.offer(curr.right);
                }
            }
        }
        return ans;
    }
}
