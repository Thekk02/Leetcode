package solution;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author kk
 * @description 彩灯装饰记录
 * @date 2024-10-17 11:23:47
 */
public class LCR150 {
    public List<List<Integer>> decorateRecord(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null){
            queue.offer(root);
        }
        while(!queue.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            for(int i = queue.size();i > 0;i--){
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}
