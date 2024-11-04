package solution;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 递增顺序查找树
 * @date 2024-10-28 09:33:12
 */
public class sln897 {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root,res);

        TreeNode dummyNode = new TreeNode(-1);
        TreeNode currNode = dummyNode;
        for(int value:res){
            currNode.right = new TreeNode(value);
            currNode = currNode.right;
        }
        return dummyNode.right;

    }
    public void inorder(TreeNode node,List<Integer> res){
        if(node == null){
            return;
        }
        inorder(node.left,res);
        res.add(node.val);
        inorder(node.right,res);
    }

}
