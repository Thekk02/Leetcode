package solution;

import DataStructure.TreeNode;
import com.sun.deploy.panel.TreeEditors;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author kk
 * @description 二叉树的层序遍历2
 * @date 2024-10-22 09:59:27
 */
public class sln107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return ans;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0;i < levelsize;i++){
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            ans.add(0,level);
        }
        return ans;
    }
}
