package solution;

import DataStructure.TreeNode;

import java.util.*;

/**
 * @author kk
 * @description 彩灯装饰记录3
 * @date 2024-11-4 15:45:51
 */
public class LCR151 {
    public List<List<Integer>> decorateRecord(TreeNode root) {
        if(root == null) return new ArrayList<>(0);
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = true;
        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            if(flag){
                int size = queue.size();
                for(int i = 0;i < size;i++){
                    TreeNode node = queue.poll();
                    temp.add(node.val);
                    if(node.left != null){
                        queue.offer(node.left);
                    }
                    if(node.right != null){
                        queue.offer(node.right);
                    }
                    flag = !flag;
                }
            }
            else{
                int size = queue.size();
                for(int i = 0;i < size;i++){
                    TreeNode node = queue.poll();
                    temp.add(0,node.val);
                    if(node.left != null){
                        queue.offer(node.left);
                    }
                    if(node.right != null){
                        queue.offer(node.right);
                    }
                    flag = !flag;
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
