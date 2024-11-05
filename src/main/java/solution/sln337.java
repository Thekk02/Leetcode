package solution;

import DataStructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author kk
 * @description 打家劫舍3
 * @date 2024-11-5 08:21:58
 */
public class sln337 {
    public int rob(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int lsum=0,rsum=0;
        boolean flag = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            if(flag){
                for(int i = 0;i < size;i++){
                    TreeNode temp = queue.poll();
                    lsum += temp.val;
                    if(temp.left != null){
                        queue.offer(temp.left);
                    }
                    if(temp.right != null){
                        queue.offer(temp.right);
                    }
                }

                flag = !flag;
            }
            else{
                for(int i = 0;i < size;i++){
                    TreeNode temp = queue.poll();
                    rsum += temp.val;
                    if(temp.left != null){
                        queue.offer(temp.left);
                    }
                    if(temp.right != null){
                        queue.offer(temp.right);
                    }
                }
                flag = !flag;
            }
        }
        return Math.max(lsum,rsum);
    }
}
